WIDTH=1024
HEIGHT=768
BULLET_SPEED=300
math.randomseed(os.time())
function love.load()
    love.window.setMode(WIDTH, HEIGHT)
    sprites = {}
    sprites.player = love.graphics.newImage("images/soldada.png")
    sprites.zombie = love.graphics.newImage("images/zombie.png")
    sprites.bullet = love.graphics.newImage("images/bala.png")
    sprites.portal = love.graphics.newImage("images/buraco.png")
    font = love.graphics.newFont("MoriaCitadel.TTF", 25)
    player = {}
    player.x = WIDTH/2
    player.y = HEIGHT/2
    player.speed = 160
    player.rotation = 0
    bullets = {}
    zombies = {}
    zombies.speed = 25
    player.score = 0
    state = 'START'
    holes = createHoles()
    timeLimit = 2
    zLimit = 0.5
    zTimer = 0
    timer = timeLimit

end

function love.update(dt)    
    
    timer = timer - dt

    if timer <= 0 then
        createZombie()
        timerLimit = timeLimit * 0.85
        timer = timeLimit
    end

    if love.keyboard.isDown('z') then
        zTimer = zTimer + dt
        if zTimer <= zLimit then
            player.rotation = player.rotation - (player.speed * dt)
                local bullet = {}
                bullet.x = player.x
                bullet.y = player.y
                bullet.direction = player.rotation
                table.insert(bullets, bullet)
                
        end
    else
    zTimer = 0
    player.rotation = mouseShooterAngle()
    end

    if love.keyboard.isDown("d") then
        player.x = player.x + player.speed * dt
    end
    if love.keyboard.isDown("a") then
        player.x = player.x - player.speed * dt
    end
    if love.keyboard.isDown("w") then
        
        player.y = player.y - player.speed * dt
    end
    if love.keyboard.isDown("s") then
        player.y = player.y + player.speed * dt
    end

    for i=#bullets, 1,-1  do
        b = bullets[i]
        b.x = b.x + BULLET_SPEED * math.cos(b.direction) * dt
        b.y = b.y + BULLET_SPEED * math.sin(b.direction) * dt
        
        if b.x < 0 or b.x > WIDTH or
            b.y < 0 or b.y > HEIGHT then
            table.remove(bullets, i)
        else
            for i, z in ipairs(zombies) do
                if collides(b, z, 35) then
                    table.remove(bullets, i)
                    table.remove(zombies, i)
                    player.score = player.score + 1
                end
            end
        end
    end 
    
    for i=#zombies, 1,-1 do
        z = zombies[i]
        z.direction = shooterZombieAngle(z)
        z.x = z.x + zombies.speed * math.cos(z.direction) * dt
        z.y = z.y + zombies.speed * math.sin(z.direction) * dt
        if collidesZombie(z, player, 25) then
            state = 'START'
        end
    end 
    
    
end

function love.draw()
    love.graphics.setFont(font)
    if state == 'START' then
        love.graphics.printf("Press Enter to start", 0, HEIGHT / 4, WIDTH,
                             'center')

    elseif state == 'PLAY' then
        love.graphics.printf("Score: " .. player.score, 0, HEIGHT/18, WIDTH, 'center')

        love.graphics.draw(sprites.player, 
        player.x, 
        player.y, 
        player.rotation, -- Rotação
        nil, -- Escala em x
        nil, -- Escala em y
        sprites.player:getWidth()/2,  -- Origem em x
        sprites.player:getHeight()/2) -- Origem em y
        love.graphics.setBackgroundColor(100/255,125/255,105/255)

        for i, h in ipairs(holes) do
            love.graphics.draw(sprites.portal, h.x, h.y)
        end
        for i, b in ipairs(bullets) do
            love.graphics.draw(sprites.bullet, b.x, b.y, 0, 0.70, 0.70, sprites.bullet:getWidth()/2, sprites.bullet:getHeight()/2)
        end
        
        for i,z in ipairs(zombies) do
            love.graphics.draw(sprites.zombie, z.x, z.y, z.direction, nil, nil, sprites.zombie:getWidth()/2, sprites.zombie:getHeight()/2)
        end   
    
 end
end

function mouseShooterAngle()
    
    return math.atan2(love.mouse.getY() - player.y,  love.mouse.getX() - player.x)
    
end

function love.keypressed(key)
    if state == 'START' and key == 'return' then
        player.score = 0
        bullets = {}
        zombies = {}
        zombies.speed = 25
        player.x = WIDTH/2
        player.y = HEIGHT/2
        player.speed = 160
        player.rotation = 0
        state = 'PLAY'
    end
    if key == "space" then
        local bullet = {}
        bullet.x = player.x
        bullet.y = player.y
        bullet.direction = mouseShooterAngle()
        table.insert(bullets, bullet)
    end
end

function shooterZombieAngle(z)
    return math.atan2(player.y - z.y, player.x - z.x)
end

function createZombie()
    local zombie = {}
    i = math.random(1,4)
    zombie.x = holes[i].x + sprites.portal:getWidth()/2
    zombie.y = holes[i].y + sprites.portal:getHeight()/2
    zombie.speed = zombies.speed
    zombie.direction = shooterZombieAngle(zombie)
    table.insert(zombies, zombie)
end

function collides(a, b, c)
   if math.sqrt( (a.y-b.y)^2 + (a.x-b.x)^2 ) <= c then 
        return true 
    else 
        return false 
    end

end

function createHoles()
    local portal = {}
    table.insert(portal, {x = 10, y = 10})
    table.insert(portal, {x = WIDTH - sprites.portal:getWidth() - 10, y = 10})
    table.insert(portal, {x = WIDTH - sprites.portal:getWidth() - 10, y = HEIGHT - sprites.portal:getHeight() - 10})
    table.insert(portal, {x = 10, y = HEIGHT - sprites.portal:getHeight() - 10})
    return portal
end

function collidesZombie(a, b, c)
    if math.sqrt( (a.y-b.y)^2 + (a.x-b.x)^2 ) <= c then 
        return true 
    else 
        return false 
    end
end

