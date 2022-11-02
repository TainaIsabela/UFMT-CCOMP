WINDOW_WIDTH = 1024
WINDOW_HEIGHT = 576
WIDTH = 640
HEIGHT = 360
push = require "lib/push"
wf = require "lib/windfield"
Class = require "lib/class"
sti = require "lib/sti"
Camera = require "lib/camera"
anim8 = require 'lib/anim8'

require "Player"
require "Map"
require "Enemy"

function love.load()
    love.graphics.setDefaultFilter("nearest", "nearest")
    push:setupScreen(WIDTH, HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT)

    world = wf.newWorld(0, 800, true)
    -- world:setQueryDebugDrawing(true)
   
    player = Player(world)
    enemy = Enemy(world)
    map = Map(world)


    sound = {}
    sound.init = love.audio.newSource("init.wav", "static")
    sound.jump = love.audio.newSource("Jump.wav", "static")
    sound.jump:setVolume(0.1)
    sound.init:setVolume(0.3)
    cam = Camera()
end 

function love.update(dt)
    world:update(dt)
    player:update(dt)
    enemy:update(dt)
    map:update(dt)
end

function love.keypressed(key)
    if key == 'escape' then
        love.event.quit()
    elseif key == 'up' then
        sound.jump:play()
        player:jump()
    end
end

function love.draw()
    love.graphics.clear(117/255, 247/255, 246/255)
    sound.init:play()
    push:start()
    cam:attach()
    world:draw()
    map:draw()
    enemy:draw()
    player:draw()
    cam:lookAt(player.x, HEIGHT-70)
    cam:detach()
    push:finish()
end