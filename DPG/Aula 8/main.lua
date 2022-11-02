WINDOW_WIDTH = love.graphics.getWidth()
WINDOW_HEIGHT = 480

WIDTH = 480
HEIGHT = 270


push = require 'push'
Class = require 'class'
require 'Map'
map = Map()
math.randomseed(os.time())


function love.load()
    love.graphics.setDefaultFilter('nearest', 'nearest')
    push:setupScreen(WIDTH, HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT)
    map:generateWorld()

end

function love.update(dt)
    
    end

function love.draw()
    push:start()
    love.graphics.clear(0, 151/255, 256/255)
    map:draw()
    push:finish()
end