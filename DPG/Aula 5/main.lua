WIDTH = 854
HEIGHT = 480
function love.load()
  love.window.setMode(WIDTH, HEIGHT, {resizable=false})
  image = love.graphics.newImage("img/CAT.png")
  img_width = image:getWidth()
  img_height = image:getHeight()
  sprite_width = img_width/12
  sprite_height = img_height/4
  sprites ={}
  sprites.attack = {}
  sprites.idle = {}
  for i=1,7 do
    sprite = love.graphics.newQuad(i*sprite_width, sprite_height, sprite_width, sprite_height, img_width, img_height)
    table.insert(sprites.idle, sprite)
  end
  for i=4,11 do
    sprite = love.graphics.newQuad(i*sprite_width, 0, sprite_width, sprite_height, img_width, img_height)
    table.insert(sprites.attack, sprite)
  end
  curFrame = 1
  state = 'idle'
end

function love.update(dt)
  curFrame = curFrame + 5 * dt
  if curFrame > 7 then
    curFrame = 1
    if state == 'attack' then
        state = 'idle'
        
        end
  end
end

function love.draw()
  idx = math.floor(curFrame)
  if state == "idle" then
    love.graphics.draw(image, sprites.idle[idx], 30,30,0,2,2)

    elseif state == "attack" then
        love.graphics.draw(image, sprites.attack[idx], 30,30,0,2,2)
    end
end

function love.keypressed(key)
  if key == "a" then
    state = 'attack'
    curFrame = 1
  end
end

function get_sprites_by_row(row, numSprites)
  local sprites = {}
  for i=1,numSprites-1 do
    sprite = love.graphics.newQuad(i*sprite_width, (row-1) * sprite_height, sprite_width, sprite_height, img_width, img_height)   
    table.insert(sprites, sprite)
    end
    return sprites
end
