WINDOW_WIDTH = 854
WINDOW_HEIGHT = 480

fighter = {}
fighter.name = "Blanka"
fighter.sayHello = function(t)
    love.graphics.print('Hi, '.. t.name)
end


function love.load()
    love.window.setMode(WINDOW_WIDTH, WINDOW_HEIGHT)
end

function love.draw()
    fighter.sayHello(fighter)
end