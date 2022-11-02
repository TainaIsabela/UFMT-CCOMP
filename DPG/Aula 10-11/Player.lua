Player = Class{}
anim8 = require 'lib/anim8'
function Player:init(world)
    
    self.x = 10
    self.y = 10
    self.speed = 100
    self.spritesheet = love.graphics.newImage('Player.png')
    self.w = self.spritesheet:getWidth()/9
    self.h = self.spritesheet:getHeight()/7
    self.cw = self.w -15
    self.ch = self.h -15 
    g = anim8.newGrid(self.w, self.h, self.spritesheet:getWidth(), self.spritesheet:getHeight())

    self.animations = {}
    self.animations.idle = anim8.newAnimation(g('1-6',1), 0.1)
    self.animations.run = anim8.newAnimation(g('1-8',2), 0.1)
    self.animations.jump = anim8.newAnimation(g('1-4',4), 0.1)
    self.animations.dead = anim8.newAnimation(g('1-9',5), 0.2)
    self.animations.attack = anim8.newAnimation(g('1-9',7), 0.1)
    self.curAnimation = self.animations.idle

    self.body = world:newRectangleCollider(self.x, self.y, self.cw, self.h)
    self.body:setFixedRotation(true)
    self.groudend = false
    self.attacked = false
    self.direction = 1
    self.isDead = false
end

function Player:update(dt)
    if isDead then
        self.curAnimation = self.animations.dead
        return
    end

    self.x, self.y = self.body:getPosition()
    if love.keyboard.isDown('left') then
        self.x = self.x - self.speed * dt
        self.direction = -1
        self.curAnimation = self.animations.run
    elseif love.keyboard.isDown('right') then
        self.x = self.x + self.speed * dt
        self.direction = 1
        self.curAnimation = self.animations.run
    else
        self.curAnimation = self.animations.idle
    end
    if self.groudend == false then
        self.curAnimation = self.animations.jump
    end

    self.body:setX(self.x)
    colliders = world:queryRectangleArea(self.x - self.w / 2,
                            self.y + self.h / 2, self.cw +10, 4, {'Solids'})
    if #colliders > 0 then
        self.groudend = true
    else
        self.groudend = false
    end

    enemies = world:queryRectangleArea( self.x - 10, self.y, self.cw+5, 22,  {'Enemies'})
    if #enemies > 0 then
        self.isDead = true
        return
    end

    self.curAnimation:update(dt)
end

function Player:draw()
    if isDead then
        self.curAnimation = self.animations.dead
        return
    end
    self.curAnimation:draw(self.spritesheet, self.body:getX(), self.body:getY(), 0,self.direction, 1.2, self.w/2, self.h/2)
end

function Player:jump()
    if self.groudend then
        self.body:applyLinearImpulse(0, -350)
    end
end