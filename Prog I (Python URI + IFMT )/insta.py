from random import choice
from splinter import Browser
from time import sleep
from selenium.webdriver.chrome.options import Options

chrome_options = Options()
# chrome_options.add_argument("--headless")
chrome_options.add_argument("--window-size=1920x1080")
chrome_options.add_argument("start-maximised")

browser = Browser('chrome', options=chrome_options)
pessoasTier1 = ['@dory130', '@terezinhatalita']
pessoasTier2 = ['@larissadourados', '@_dante_silva', '@barbosa_gabriel23', '@unicornia_army_', '@yuriabstrato', '@batata_1792', '@xty_arantes', '@henry_igor', '@fabio_galle', '@tatt.melo']
try:
    print('Iniciando...')
    browser.visit('https://www.instagram.com/')
    sleep(2)
    browser.find_by_css('input[name="username"]').fill('tainaisabela9@gmail.com')
    browser.find_by_css('input[name="password"]').fill('Estrela9')
    browser.find_by_css('button > div').click()
    sleep(4)
    browser.find_by_text('Not Now').first.click()
    browser.visit('https://www.instagram.com/p/CGS68IVBziB/')
    sleep(2)
    for i in range(0,2000):
        # escolhido1 = choice(pessoasTier1)
        # escolhido2 = choice(pessoasTier2)
        # print(f'comentario numero: {i}\nFelizardos da vez: {escolhido1}, {escolhido2}')
        print(f'comentario numero: {i}')
        browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
        sleep(1)
        # browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'@waalrick {escolhido1} {escolhido2}')
        browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'@waalrick @dory130 @terezinhatalita')
        sleep(1)
        browser.find_by_css('button[type="submit"]').first.click()
        print(f'comentario numero: {i} feito com sucesso')
        sleep(25)
        browser.reload()

    print('Finalizado com Sucesso')
    browser.quit()
except Exception as e:
    print(f'Ocorreu o erro: {e}')
    browser.screenshot('/home/walrick/Documents/taina/erro.png', full=True)
    browser.quit()
