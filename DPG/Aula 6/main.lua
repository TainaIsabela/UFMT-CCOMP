WINDOW_WIDTH = 854
WINDOW_HEIGHT = 280
VIRTUAL_WIDTH = 768
VIRTUAL_HEIGHT = 192
push = require 'push'

function love.load()
    love.graphics.setDefaultFilter("nearest", "nearest")
    push:setupScreen(VIRTUAL_WIDTH, VIRTUAL_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT)
    fg = love.graphics.newImage("img/seaview_foreground_empty.png")
    bg = love.graphics.newImage("img/underwater-fantasy-preview.png")
    mario = love.graphics.newImage("img/mario.png")
    bg_scroll_speed = 40
    fg_scroll_speed = 80
    xbg = 0
    xfg = 0

end

function love.update(dt)
    xbg = (xbg - bg_scroll_speed * dt) % -VIRTUAL_WIDTH
    xfg = (xfg - fg_scroll_speed * dt) % -VIRTUAL_WIDTH

end

function love.draw()
    push:start()
    love.graphics.draw(bg, xbg, 0)
    love.graphics.draw(bg, VIRTUAL_WIDTH + xbg, 0)
    love.graphics.draw(fg, xfg, 0)
    love.graphics.draw(fg, VIRTUAL_WIDTH + xfg, 2000)
    push:finish()
end