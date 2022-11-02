Enemy = Class {}
anim8 = require 'lib/anim8'

function Enemy:init(world)
    Enemies = {}
    self.world = world
    self.speed = 20
    self.spritesheet = love.graphics.newImage('Enemy.png')
    self.w = self.spritesheet:getWidth() / 8
    self.h = self.spritesheet:getHeight() / 5
    self.cw = self.w - 15
    self.ch = self.h 
    g = anim8.newGrid(self.w, self.h, self.spritesheet:getWidth(),
                      self.spritesheet:getHeight())
    self.animations = {}
    self.animations.idle = anim8.newAnimation(g('1-8', 2), 0.1)
    self.body = world:newRectangleCollider(0, 0, self.cw, self.ch,
                                           {collision_class = 'Enemies'})
    self.body:setFixedRotation(true)
    self.direction = -1
    self.curAnimation = self.animations.idle
    self.gameMap = sti("maps/mapinha_lindo.lua")
    self:location()
end

function Enemy:update(dt)
    self.x, self.y = self.body:getPosition()
    self.x = self.x + dt * self.speed * self.direction
    if self.x < 340 then
        self.direction = 1
    elseif self.x > 420 then
        self.direction = -1
    end
    self.curAnimation:update(dt)
    self.body:setX(self.x)
end

function Enemy:draw()
    self.curAnimation:draw(self.spritesheet, self.body:getX(), self.body:getY(),
                           0, self.direction, 1.2, self.w / 2, self.h / 2)
end

function Enemy:location()
    local solid
    for _, obj in ipairs(self.gameMap.layers['Enemies'].objects) do
        self.x = obj.x
        self.y = obj.y
        self.body:setPosition(self.x, self.y)
    end
end
