WIDTH = 960
HEIGHT = 540

function love.load()
    math.randomseed(os.time())
    love.window.setMode(WIDTH, HEIGHT, {resizable = false})
    love.window.setTitle("Ping Pong")
    font = love.graphics.newFont("KeyVirtue.ttf", 70)
    bigFont = love.graphics.newFont("KeyVirtue.ttf", 100)
    racket1 = {}
    racket1.x = 10
    racket1.y = HEIGHT / 2 - 40
    racket1.width = 20
    racket1.height = 80
    racket1.score = 0

    racket2 = {}
    racket2.x = WIDTH - 30
    racket2.y = HEIGHT / 2 - 40
    racket2.width = 20
    racket2.height = 80
    racket2.score = 0

    ball = {}
    ball.x = WIDTH / 2 - 10
    ball.y = HEIGHT / 2 - 10
    ball.radius = 30
    ball.width = 20
    ball.height = 20
    ball.dx = 0
    ball.dy = 0
    ball.service_direction = 1 -- se move para direita

    state = 'START'

    sound = {}

    sound.hit_racket = love.audio.newSource("hitRacket.wav", "static")
    sound.point = love.audio.newSource("point.wav", "static")
    sound.hitWall = love.audio.newSource("hitWall.wav", "static")

    sound.hit_racket:setVolume(0.5)
    sound.point:setVolume(0.1)
    sound.hitWall:setVolume(0.1)
end

function love.update(dt)
    racket1.y = ball.y - (280 *dt ) / 3
    if love.keyboard.isDown("up") then racket2.y = racket2.y - (350 * dt) end
    if love.keyboard.isDown("down") then racket2.y = racket2.y + (350 * dt) end

    if racket2.y < 0 then racket2.y = 0 end
    if racket2.y > HEIGHT - racket2.height then
        racket2.y = HEIGHT - racket2.height
    end

    if racket1.y < 0 then racket1.y = 0 end
    if racket1.y > HEIGHT - racket1.height then
        racket1.y = HEIGHT - racket1.height
    end

    if collides(ball, racket2) then
        ball.dx = -ball.dx * 1.05
        ball.x = racket2.x - racket2.width
        ball.dy = math.random(-200, 200)
        sound.hit_racket:play()

    end

    if collides(ball, racket1) then
        ball.dx = -ball.dx * 1.05
        ball.x = racket1.x + racket1.width
        ball.dy = math.random(-200, 200)
        sound.hit_racket:play()
    end

    if ball.x + ball.width > WIDTH then
        centralizes(ball)
        sound.point:play()
        racket1.score = racket1.score + 1
        if racket1.score == 3 then
            state = 'START'
        else
            ball.service_direction = 1
            state = 'serve'
        end
    end

    if ball.x < 0 then
        centralizes(ball)
        sound.point:play()
        racket2.score = racket2.score + 1
        if racket2.score == 3 then
            state = 'START'
        else
            ball.service_direction = -1
            state = 'serve'
        end
    end

    if ball.y < 0 then
        ball.y = 0
        ball.dy = -ball.dy
        sound.hitWall:play()
    end

    if ball.y + ball.width > WIDTH then
        ball.y = 0
        ball.dy = -ball.dy
    end

    confinesrackets(racket1)
    confinesrackets(racket2)

    if ball.y + ball.height > HEIGHT then
        ball.y = HEIGHT - ball.height
        ball.dy = -ball.dy
        sound.hitWall:play()
    end

    if ball.x + ball.width > WIDTH then
        ball.x = WIDTH - ball.width
        ball.dx = -ball.dx
    end

    ball.x = ball.x + ball.dx * dt
    ball.y = ball.y + ball.dy * dt

end

function love.draw()
    love.graphics.setFont(font)
    love.graphics.setColor(114 / 255, 239 / 255, 221 / 255)

    if state == 'START' then
        love.graphics.printf("Press Enter to start", 0, HEIGHT / 4, WIDTH,
                             'center')
        racket2.score = 0
        racket1.score = 0
    elseif state == 'serve' then
        love.graphics.printf("Press Enter to serve", 0, HEIGHT / 4, WIDTH,
                             'center')
    end
    


    love.graphics.setFont(bigFont)
    love.graphics.printf(racket1.score, 200, HEIGHT / 2, WIDTH, 'left')
    love.graphics.printf(racket2.score, 0, HEIGHT / 2, WIDTH - 200, 'right')
    love.graphics.setColor(94 / 255, 96 / 255, 206 / 255)
    love.graphics.setBackgroundColor(116 / 255, 0 / 255, 184 / 255)
    love.graphics.rectangle("fill", racket1.x, racket1.y, racket1.width,
                            racket1.height)
    love.graphics.rectangle("fill", ball.x, ball.y, ball.width, ball.height)

    love.graphics.rectangle("fill", racket2.x, racket2.y, racket2.width,
                            racket2.height)
end

function collides(ball, racket)
    if ball.y > racket.y + racket.height or ball.y + ball.height < racket.y then
        return false
    end
    if ball.x > racket.x + racket.width or ball.x + ball.width < racket.x then
        return false
    end
    return true
end

function love.keypressed(key)
    if state == 'START' and key == 'return' then
        ball.dx = ball.service_direction * 500
        ball.dy = math.random(-200, 200)
        state = 'play'
        racket1.score = 0
        racket2.score = 0
    end
    if state == 'serve' and key == 'space' then
        ball.dx = ball.service_direction * 500
        ball.dy = math.random(-200, 200)
        state = 'play'
    end
end

function centralizes(ball)
    ball.x = WIDTH / 2
    ball.y = HEIGHT / 2
    ball.dx = 0
    ball.dy = 0
end

function confinesrackets(racket)
    if racket.y < 0 then racket.y = 0 end
    if racket.y + racket.height > HEIGHT then
        racket.y = HEIGHT - racket.height
    end
end
