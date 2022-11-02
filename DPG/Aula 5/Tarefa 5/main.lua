WIDTH = 854
HEIGHT = 480
function love.load()
  font = love.graphics.newFont("KeyVirtue.ttf", 70)
  love.graphics.setDefaultFilter("nearest", "nearest")
  love.window.setMode(WIDTH, HEIGHT, {resizable = true})
  tile = love.graphics.newImage("tiles.png")
  Monster_image = love.graphics.newImage("monster.png")
  Cat_image = love.graphics.newImage("CAT.png")
  Tiles_img_width = tile:getWidth()
  Tiles_img_height = tile:getHeight()
  Monster_img_width = Monster_image:getWidth()
  Monster_img_height = Monster_image:getHeight()
  Cat_img_width = Cat_image:getWidth()
  Cat_timg_height = Cat_image:getHeight()
  Tiles_width = Tiles_img_width / 9
  Tiles_height = Tiles_img_height /9
  monster_width = Monster_img_width/6
  monster_height = Monster_img_height/8
  cat_width = Cat_img_width/12
  cat_height = Cat_timg_height/4
  cats ={}
  monsters = {}
  monsters.idle = {}
  cats.idle = {}
  cats.dead = {}
  tiles = {}
  monster_width = Monster_img_width/6
  monster_height = Monster_img_height/8
  player_width = Cat_img_width/12
  player_height = Cat_timg_height/4
  tiles.green = love.graphics.newQuad(5*Tiles_width ,8*Tiles_height, Tiles_width, Tiles_height, Tiles_img_width, Tiles_img_height)
  tiles.floor = love.graphics.newQuad(7*Tiles_width, Tiles_height, Tiles_width, Tiles_height, Tiles_img_width, Tiles_img_height)
  tiles.water = love.graphics.newQuad(4*Tiles_width, Tiles_height, Tiles_width, Tiles_height, Tiles_img_width, Tiles_img_height)
  
  for i=0,7 do
    monsters.idle[i] = love.graphics.newQuad((i-1)*monster_width, 0, monster_width, monster_height, Monster_img_width, Monster_img_height)
    table.insert(monsters.idle, monsters.idle[i])
  end
  for i=1,7 do
    cat = love.graphics.newQuad(i*cat_width, cat_height, cat_width, cat_height, Cat_img_width, Cat_timg_height)
    table.insert(cats.idle, cat)
  end
  for i=1,11 do
    cat = love.graphics.newQuad(i*cat_width, 2, cat_width, cat_height, Cat_img_width, Cat_timg_height)
    table.insert(cats.dead, cat)
  end

  tilemap={
    {1,1,1,1,1,1,1,1,1,1,2,2,2,2},
    {0,0,0,1,1,1,1,1,1,1,2,2,2,2},
    {1,1,0,0,0,0,0,0,1,1,2,2,2,1},
    {1,1,1,0,0,0,0,0,1,1,1,1,1,1},
    {1,1,1,0,0,0,0,0,0,1,1,1,1,1},
    {2,1,1,0,0,0,0,0,0,0,0,0,0,0},
    {2,2,2,1,1,1,1,1,0,0,0,0,0,0},
    {2,2,2,2,1,1,1,1,1,1,1,1,0,0},

  }
  catFrame = 1
  monsterFrame = 1
  state = 'START'
  player = {x = 800, y = 400}
  monster = {x = 150, y = 150, rotation = 0}
  dx = 150
end

function love.update(dt)
  catFrame = catFrame + 5 * dt
  if catFrame > 7 then
    catFrame = 1
  end
  monsterFrame = monsterFrame + 5 * dt

  if monsterFrame > 7 then
    monsterFrame = 1
  end
  monster.x = dx * dt + monster.x
  if monster.x > 450 then
    monster.x = 450
    dx = -150
  end

  if monster.x < 150 then
    monster.x = 150
    dx = 150
  end

  if collides(player, monster) then
    state = 'dead'

end
  

  if love.keyboard.isDown('right') then
    player.x = player.x + 200 * dt
  end
  if love.keyboard.isDown('left') then
    player.x = player.x - 200 * dt
  end
  if love.keyboard.isDown('up') then
    player.y = player.y - 200 * dt
  end
  if love.keyboard.isDown('down') then
    player.y = player.y + 200 * dt
  end
  
end

function love.draw()
  love.graphics.setFont(font)
  idx = math.floor(catFrame)
  Midx = math.floor(monsterFrame)
  love.graphics.setFont(font)
  for i, row in ipairs(tilemap) do
    for j, v in ipairs(row) do
        if v == 1 then
            love.graphics.draw(tile, tiles.green, j*64-64, i*64-64, 0, 5, 5, Tiles_width/2, Tiles_height/2)
    elseif v == 2 then
            love.graphics.draw(tile, tiles.water, j*64-64, i*64-64, 0, 5, 5, Tiles_width/2, Tiles_height/2)
    elseif v == 0 then
            love.graphics.draw(tile, tiles.floor, j*64-64, i*64-64, 0, 5, 5, Tiles_width/2, Tiles_height/2)
        end
    end
end
  if state == 'START' then
    love.graphics.printf("Press Enter to start", 0, HEIGHT / 4, WIDTH,
                         'center')
  elseif state == 'idle' then
    
    
    love.graphics.draw(Cat_image, cats.idle[idx], player.x, player.y, 0, 0.65, 0.65, cat_width/2, cat_height/2)
    love.graphics.draw(Monster_image, monsters.idle[Midx], monster.x, monster.y, monster.rotation, 1.5, 1.5, monster_width/2, monster_height/2)
  elseif state == "dead" then
      love.graphics.printf("You are dead", 0, HEIGHT / 4, WIDTH,
                           'center')
    
    
  end
end

function love.keypressed(key)
  if state == 'START' and key == 'return' then
    state = 'idle'
  end
  local x= player.x
  local y= player.y
  
  if key == "up" then
    x = x - 1
  
  elseif key == "down" then
    x = x + 1
  
  elseif key == "left" then
    y = y - 1
  
  elseif key == "right" then
    y = y + 1
  end
  -- if tilemap[y][x] == floor then
  --   player.x = x
  --   player.y = y 
  -- end
  player.x = x
  player.y = y 
end

function collides(player, monster)
  return player.x < monster.x + monster_width and
         player.x + player_width > monster.x and
         player.y < monster.y + monster_height and
         player_height + player.y > monster.y  
end