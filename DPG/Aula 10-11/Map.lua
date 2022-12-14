Map = Class {}

function Map:init(world)
    self.world = world
    self.solids = {}
    self.gameMap = sti("maps/mapinha_lindo.lua")
    self:createSolids()
end

function Map:update(dt)
    self.gameMap:update(dt)
end

function Map:draw()
    self.gameMap:drawLayer(self.gameMap.layers['Tile Layer 1'])
end

function Map:createSolids()
    local solid
    for _, obj in ipairs(self.gameMap.layers['Solids'].objects) do
            solid = self.world:newRectangleCollider(obj.x, obj.y, obj.width, obj.height, {collision_class = 'Solids'})
            solid:setType('static')
            table.insert(self.solids, solid)
    end
end