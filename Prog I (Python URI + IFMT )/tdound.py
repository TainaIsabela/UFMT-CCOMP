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
'@geloma12', '@_capricorniana22_', '@maria_eduarda560', '@eaebea3','@barbosa_gabriel23', '@dalyla_lylla1', '@_.carlaabreu', '@fiuza.victor',
'@lorraynefsr',  '@diegoreall_07', '@weverton_gomesss', '@gleycianneleal', '@ble_ncosta', '@rosa.maria3656', '@bruna.arauujoo',
'@Daiarasousa1997', '@carinemeri', '@miim_paixão', '@leandra_vitoria223',  '@xxstharxx', '@fabiojr102', '@helidacristinaalves', '@herculescamara_',
'@day_sousa123', '@felipe_saraiva97', '@narley_go', '@eugabrielamoura', '@eduarda.haryats',  '@daya_sorteios',
'@layanee.siilvaa', '@lay_siilva25', '@amandaa__mendess', '@day_dry', '@mannu.Rosário', '@daya_2020ferreira', '@daya_ferreira2020',
'@dayany_dry1', '@nathfraga3785', '@anaclarasbg01', '@d_brittoo', '@eubarros93b', '@britoddsilva',  '@laco_vivi_oficial',
'@dayanaadrielly', '@anapaulaturatto', '@_danilo.fernandes', '@thierryprofet', '@gracaaasantos', '@taah_sbueno', '@owwjuju', '@owjujuba', '@_julianajsa',
'@danilo.fernnandes', '@Adrianoxis', '@Adrianowqq', '@ffernandamacedo', '@marciapcavalheiro', '@unicornia_army_', '@samael.lycus','@larissadourados',
'@EU_QUELZIINHA_',  '@helobsants', '@pequena5158', '@Evely_camilly15', '@lellybonfim17',  '@guilherme_barbosa78',
'@sofibsantos', '@lollaa_silva', '@lleia_m', '@jessica_bonelli', '@ollyver.ofc', '@jaquehcardoso279',
'@diogo_oficial11', '@benedita_ssl25', '@santiago_davi95', '@vinniimaximo', '@rodrigodiasc92','@dory130', '@terezinhatalita', '@waalrick',
'@yuriabstrato', '@batata_1792', '@xty_arantes', '@henry_igor', '@fabio_galle', '@tatt.melo',
'@laryvieirae', '@criador.551', '@luixmore', '@nery.2016', '@mariaf_qpenteado_', '@motaa_dixx', '@hiroshi_yakabe', '@sarahmerib_',
'@natashaloureny', '@jonas_rodrig', '@bene.dita50', '@rafaelaaqueiroz__', '@feehsix', '@Mari_a_freitas', '@eu_rayanequeiroz', '@__wisllainy1',
'@_euwisllainy', '@edla_souza', '@myllena_vieira34', '@andressasampaioo_', '@vanilla_sts',  '@myllena_vieira2',  '@im.eloss', '@_isahchristina',
'@hugoo_fabricioo', '@oficialmaedaluiza', '@eu.luiza2012', '@kelziinha.30',  '@Alves_30_Rakel', '@euringer_paty', '@euringerpatricia'

]

try:
    print('Iniciando...')
    browser.visit('https://www.instagram.com/')
    sleep(2)
    browser.find_by_css('input[name="username"]').fill('tainaisabela9@gmail.com')
    browser.find_by_css('input[name="password"]').fill('Estrela9')
    browser.find_by_css('button > div').click()
    sleep(4)
    browser.find_by_text('Not Now').first.click()
    sleep(2)
    for i in range(0,200):
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
        sleep(60)
        browser.reload()
    print('Finalizado com Sucesso')
    browser.quit()
except Exception as e:
    print(f'Ocorreu o erro: {e}')
    browser.screenshot('/home/walrick/Documents/taina/erro.png', full=True)
    browser.quit()
