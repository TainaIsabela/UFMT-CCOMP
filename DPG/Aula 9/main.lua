WINDOW_WIDTH = 1024
WINDOW_HEIGHT = 576
wf = require 'lib/windfield'
math.randomseed(os.time())


function love.load()
    love.window.setMode(WINDOW_WIDTH, WINDOW_HEIGHT)
    world = wf.newWorld(0, 800, false)
    world:setQueryDebugDrawing(true)
    sprite = love.graphics.newImage('images/star.png')
    side = 50
    radius = 25
    speed = 200
    for i=1, 15 do
        box = world:newRectangleCollider(math.random(0, 1024-side), math.random(0, 500-side), side, side)
        box:setRestitution(0.3)
    end
    player = box
    player:setFixedRotation(true)
    player:setRestitution(0)

    plat2 = world:newRectangleCollider(200, 350, 300, 40)
    plat2:setType('static')


    ground  = world:newRectangleCollider(60, 500, 1024, 76)
    ground:setType('static')

end

function love.update(dt)
    px,py = player:getPosition()
    if love.keyboard.isDown('right') then
        player:applyLinearImpulse(50, 0)
    elseif love.keyboard.isDown('left') then
        player:applyLinearImpulse(-50, 0)
    end
    world:update(dt)
end 

function love.keypressed(key)
    if key == 'up' then
        player:applyLinearImpulse(0, -200+player:getY())
        -- quanto mais alto, menor a força
        if player:getY() > 250 then
            player:applyLinearImpulse(0, -1700-player:getY()+100)
        end
    elseif key == 'q' then
        colliders = world:queryCircleArea(player:getX(), player:getY(), 200)
        for _, collider in ipairs(colliders) do
            if collider ~= player then
                if collider:getX() > player:getX() then
                    collider:applyLinearImpulse(2000, 2000)
                else
                    collider:applyLinearImpulse(-2000, 2000)
                end
            end
        end
    end
end

function love.draw()

    world:draw()

    love.graphics.draw(sprite, player:getX(), player:getY(), 0, 0.06, 0.06, sprite:getWidth()/2, sprite:getHeight()/2+10)
end



