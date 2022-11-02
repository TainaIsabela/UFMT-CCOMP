Map = Class {}
TILE_EMPTY = -1
TILE_BRINK = 19
TILE_WATER = 41
TILE_CLOUD = 52
TILE_BUSH = 49
TILE_TREE1 = 24
TILE_TREE2 = 31 
TILE_TREE3 = 38 
TILE_ROCK = 48
TILE_FLOWER = 46
SPEED = 100
function Map:init()
    self.tileset = love.graphics.newImage('tileset.png')
    self.mapWidth = 40
    self.mapHeight = 26
    self.tileWidth = 16
    self.tileHeight = 16
    self.tileMap = {}
    self.tiles = self:createQuads()
    self.camX=0
    self.camY=0
    for i = 1, self.mapHeight * self.mapWidth do
         self.tileMap[i] = TILE_EMPTY
    end
    for i = #self.tileMap/2+1, #self.tileMap do
        self.tileMap[i] = TILE_BRINK
    end

end

function Map:getTile(x, y)
    return self.tileMap[(y - 1) * self.mapWidth + x]
end

function Map:setTile(x, y, id)
    self.tileMap[(y - 1) * self.mapWidth + x] = id
end

function Map:draw()
    local tileId
    for i = 1, self.tileHeight do
        for j = 1, self.tileWidth do
            tileId = self:getTile(j, i)
            if tileId ~= TILE_EMPTY then
                love.graphics.draw(self.tileset, self.tiles[tileId],
                                   (j - 1) * self.tileWidth,
                                   (i - 1) * self.tileHeight)
            end
        end
    end
end

function Map:update(dt)
    if love.keyboard.isDown('right') then
        self.camX = math.min(self.camX + SPEED * dt, self.mapWidth * self.tileWidth - WIDTH)
    elseif
    love.keyboard.isDown('left') then
        self.camX = math.max(self.camX - SPEED * dt, 0)
    elseif
    love.keyboard.isDown('up') then
        self.camY = math.max(self.camY - SPEED * dt, 0)
    elseif
    love.keyboard.isDown('down') then
        self.camY = math.min(self.camY + SPEED * dt, self.mapHeight * self.tileHeight - HEIGHT)
    end

    self.camX = math.min(self.camX + SPEED * dt, self.mapWidth * self.tileWidth - WIDTH)

end


function Map:generateWorld()

    local x
    for x = 1, self.mapWidth/2 do
        if math.random(1,10) == 1 then
            y = math.random(1, self.mapHeight/2-4)
            self:setTile(x, y, TILE_CLOUD)
        end
        y = self.mapHeight/2
        if math.random(1, 20) == 1 then
            
            self:setTile(x, y, TILE_BUSH)
        elseif math.random(1, 15) == 1 then
            y = self.mapHeight/2
            self:setTile(x, y-2, TILE_TREE1)
            self:setTile(x, y-1, TILE_TREE2)
            self:setTile(x, y, TILE_TREE3)

        elseif math.random(1, 20) == 1 then
            self:setTile(x, y, TILE_ROCK)

        elseif math.random(1, 20) == 1 then
            self:setTile(x, y, TILE_FLOWER)
        end

        for y = self.mapHeight/1.05, self.mapHeight do
            self:setTile(x, y, TILE_water)
        end
    end


end

function Map:createQuads()
    local tiles = {}
    rows = self.tileset:getHeight() / self.tileHeight
    cols = self.tileset:getWidth() / self.tileWidth
    for i = 1, rows do
        for j = 1, cols do
            tiles[(i - 1) * cols + j] = love.graphics.newQuad((j - 1) * self.tileWidth,
                                                              (i - 1) * self.tileHeight,
                                                              self.tileWidth,
                                                              self.tileHeight,
                                                              self.tileset:getWidth(),
                                                              self.tileset:getHeight())
        end
    end
    return tiles
end
