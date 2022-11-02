function love.load()
    x = 0
    z = 800
    y = 100
    dx = 150
    bigFont = love.graphics.newFont("MoriaCitadel.TTF", 18)
    dog = love.graphics.newImage("dog.png")
    cat = love.graphics.newImage("cat.png")
    w = love.graphics.getWidth()
    h = love.graphics.getHeight()
    xdog1 = 0.5
    xdog2 = -0.5
    ydog1 = 200
    ydog2 = h/2
    aux = 1

    
end

function love.update(dt)   

    if x > w then
        x = 0
        z = 790  

        if aux % 2 == 0 then
            xdog1 = 0.5
            xdog2 = -0.5
            ydog1 = 200
            ydog2 = h/2
            
        else
            xdog1 = 0.5
            xdog2 = -0.5
            ydog1 = h/2
            ydog2 = 200
        end
        aux = aux + 1
    else 
        x = x + dx * dt
        z = z - dx * dt
    end

end



function love.draw()
    love.graphics.setFont(bigFont)
    love.graphics.setBackgroundColor(185/255,157/255,234/255)
    love.graphics.print("Salve o gatinho!", 280, 575)

    love.graphics.draw(dog, z, ydog2, 0, xdog1, 0.5, dog:getWidth()/2, dog:getHeight()/2)
    love.graphics.draw(dog, x, ydog1, 0, xdog2, 0.5, dog:getWidth()/2, dog:getHeight()/2)
    
    love.graphics.draw(cat, w/2, 500, 0, -0.2, 0.2)

end