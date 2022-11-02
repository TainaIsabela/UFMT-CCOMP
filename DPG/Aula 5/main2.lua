WIDTH = 854
HEIGHT = 480
function love.load()
  love.graphics.setDefaultFilter("nearest", "nearest")
  love.window.setMode(WIDTH, HEIGHT)
  frames = {}
  for i=1,8 do
    frame = love.graphics.newImage("img/k"..i..".png")
    table.insert(frames, frame)
  end
  -- sprites.block = love.graphics.newImage("img/block.png")
  -- sprites.player = love.graphics.newImage("img/player.png")
  -- player = {x = 2, y = 2}

  tilemap={
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},

  }

  curFrame = 1
end

function love.update(dt)
  curFrame =  curFrame + 12 * dt
  if curFrame >= 9 then
    curFrame = 1
  end
end


function love.draw()
    -- for i, row in ipairs(tilemap) do
    --     for j, v in ipairs(row) do
    --         if v == 1 then
    --             love.graphics.draw(sprites.block, j*64-54, i*64-54)
    --         end
    --     end
    -- end
    idx = math.floor(curFrame)
    love.graphics.draw(frames[idx])
end

-- function love.keypressed(key)
--   local x= player.x
--   local y= player.y
  
--   if key == "up" then
--     x = x - 1
  
--   elseif key == "down" then
--     x = x + 1
  
--   elseif key == "left" then
--     y = y - 1
  
--   elseif key == "right" then
--     y = y + 1
--   end
--   if tilemap[y][x] ~= 1 then
--     player.x = x
--     player.y = y 
--   end
  
-- end