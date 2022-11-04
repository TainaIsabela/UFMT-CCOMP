from random import choice
from splinter import Browser
from time import sleep
from selenium.webdriver.chrome.options import Options

chrome_options = Options()
#chrome_options.add_argument("--headless")
chrome_options.add_argument("--window-size=1920x1080")
chrome_options.add_argument("start-maximised")

browser = Browser('chrome', options=chrome_options)

pessoasTier1= [ '@maira._.godoi',  '@_Camila.diix', '@silmacedosousa', '@indcris98', '@patriciaeuringer', '@kellynha_thabielka',
'@euringerpaty', '@eugabri3la @lorenamrego', '@jeffao_0', '@loyanelop', '@loyanesilva98', '@rodrigues.costa96', '@nathaliasousaaraujo',
'@geloma12', '@_capricorniana22_', '@maria_eduarda560', '@eaebea3',
'@lorraynefsr',  '@diegoreall_07', '@weverton_gomesss', '@gleycianneleal', '@ble_ncosta', '@rosa.maria3656', '@bruna.arauujoo',
'@Daiarasousa1997', '@carinemeri', '@miim_paixão', '@leandra_vitoria223',
'@day_sousa123', '@felipe_saraiva97', '@narley_go', '@eugabrielamoura', '@eduarda.haryats',  '@daya_sorteios',
'@layanee.siilvaa', '@lay_siilva25', '@amandaa__mendess', '@day_dry', '@mannu.Rosário', '@daya_2020ferreira', '@daya_ferreira2020',
'@dayany_dry1', '@nathfraga3785', '@anaclarasbg01', '@d_brittoo', '@eubarros93b', '@britoddsilva',  '@laco_vivi_oficial',
'@dayanaadrielly', '@anapaulaturatto', '@_danilo.fernandes', '@thierryprofet', '@gracaaasantos', '@taah_sbueno', '@owwjuju', '@owjujuba', '@_julianajsa',
'@danilo.fernnandes', '@Adrianoxis', '@Adrianowqq', '@ffernandamacedo', '@marciapcavalheiro', '@unicornia_army_', '@samael.lycus',
'@EU_QUELZIINHA_',  '@helobsants', '@pequena5158', '@Evely_camilly15', '@lellybonfim17',  '@guilherme_barbosa78',
'@sofibsantos', '@lollaa_silva', '@lleia_m', '@jessica_bonelli', '@ollyver.ofc', '@jaquehcardoso279',
'@diogo_oficial11', '@benedita_ssl25', '@santiago_davi95', '@vinniimaximo', '@rodrigodiasc92','@dory130', '@terezinhatalita', '@waalrick',
'@yuriabstrato', '@batata_1792', '@xty_arantes', '@henry_igor', '@fabio_galle', '@tatt.melo',
'@jonas_rodrig', '@bene.dita50', '@rafaelaaqueiroz__', '@feehsix', '@Mari_a_freitas', '@eu_rayanequeiroz', '@__wisllainy1',
'@_euwisllainy', '@edla_souza', '@myllena_vieira34', '@andressasampaioo_', '@vanilla_sts',  '@myllena_vieira2',  '@im.eloss', '@_isahchristina',
'@hugoo_fabricioo', '@oficialmaedaluiza', '@eu.luiza2012', '@kelziinha.30',  '@Alves_30_Rakel', '@euringer_paty', '@euringerpatricia'
]

try:
    print('Iniciando...')
    browser.visit('https://www.instagram.com/')
    sleep(2)
    browser.find_by_css('input[name="username"]').fill('akaneyoko9@gmail.com')
    browser.find_by_css('input[name="password"]').fill('estrela9')
    browser.find_by_css('button > div').click()
    sleep(4)
    browser.find_by_text('Not Now').first.click()
    sleep(2)
    for j in range(0,30):

        #sorteio Vinho
        browser.visit('https://www.instagram.com/p/CHqnO3uFQmP/')
        sleep(2)
        escolhido1 = choice(pessoasTier1)
        escolhido2 = choice(pessoasTier1)
        print(f'Felizardos da vez: {escolhido1}, {escolhido2} : Vinho')
        browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
        sleep(1)
        browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'{escolhido1}, {escolhido2}')
        sleep(1)
        browser.find_by_css('button[type="submit"]').first.click()
        sleep(25)

        for i in range(0,7):
            #sorteio ipl
            browser.visit('https://www.instagram.com/p/CGlQkg4DOLB/')
            sleep(2)
            escolhido1 = choice(pessoasTier1)
            print(f'comentario numero: {i}\nFelizardo da vez: {escolhido1} : IPL')
            browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
            sleep(1)
            browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'{escolhido1}')
            sleep(1)
            browser.find_by_css('button[type="submit"]').first.click()
            sleep(25+i)

#        for i in range(0,10):
            #sorteio make 21/11
#            browser.visit('https://www.instagram.com/p/CHNZJTiDh27/')
#            sleep(2)
#            escolhido1 = choice(pessoasTier1)
#            escolhido2 = choice(pessoasTier1)
#            print(f'Felizardos da vez: {escolhido1}, {escolhido2} : Make 21')
#            browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
#            sleep(1)
#            browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'{escolhido1}, {escolhido2}')
#            sleep(1)
#            browser.find_by_css('button[type="submit"]').first.click()
#            sleep(25)

#        for i in range(0,10):
#            #sorteio make 22/11
#            browser.visit('https://www.instagram.com/p/CHfVI3Yg7gZ/')
#            sleep(2)
#            escolhido1 = choice(pessoasTier1)
#            print(f'Felizardo da vez: {escolhido1} : make 22')
#            browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
#            sleep(1)
#            browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'{escolhido1}')
#            sleep(1)
#            browser.find_by_css('button[type="submit"]').first.click()
#            sleep(25)


        for i in range(0,5):
            #sorteio roupas
            browser.visit('https://www.instagram.com/p/CHqHxnxh37x/')
            sleep(2)
            escolhido1 = choice(pessoasTier1)
            escolhido2 = choice(pessoasTier1)
            print(f'Felizardos da vez: {escolhido1}, {escolhido2} : Barra 1')
            browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
            sleep(1)
            browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'{escolhido1}, {escolhido2}')
            sleep(1)
            browser.find_by_css('button[type="submit"]').first.click()
            sleep(25+i)

            #sorteio barra 2
            #browser.visit('https://www.instagram.com/p/CHJX9rxBK2x/')
            #sleep(2)
            #escolhido1 = choice(pessoasTier1)
            #escolhido2 = choice(pessoasTier1)
            #print(f'Felizardos da vez: {escolhido1}, {escolhido2} : Barra 2')
            #browser.find_by_css('textarea[placeholder="Add a comment…"]').first.click()
            #sleep(1)
            #browser.find_by_css('textarea[placeholder="Add a comment…"]').fill(f'{escolhido1}, {escolhido2}')
            #sleep(1)
            #browser.find_by_css('button[type="submit"]').first.click()
            #sleep(25)
            #browser.quit()
    browser.quit()
    sleep(600)

    print('Finalizado com Sucesso')

except Exception as e:
    print(f'Ocorreu o erro: {e}')
    browser.screenshot('/home/walrick/Documents/taina/erro.png', full=True)
    browser.quit()
