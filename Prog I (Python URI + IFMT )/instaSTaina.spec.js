/// <reference types="cypress" />
const pessoasTier1= ['@maira._.godoi',  '@_Camila.diix', '@silmacedosousa', '@indcris98', '@patriciaeuringer', '@kellynha_thabielka',
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
'@jonas_rodrig', '@bene.dita50', '@rafaelaaqueiroz__', '@feehsix', '@Mari_a_freitas', '@eu_rayanequeiroz', '@__wisllainy1',
'@_euwisllainy', '@edla_souza', '@myllena_vieira34', '@andressasampaioo_', '@vanilla_sts',  '@myllena_vieira2',  '@im.eloss', '@_isahchristina',
'@hugoo_fabricioo', '@oficialmaedaluiza', '@eu.luiza2012', '@kelziinha.30',  '@Alves_30_Rakel', '@euringer_paty', '@euringerpatricia',
'@elanbrilhant',  '@liverbrilhant', '@faah_santosz',  '@lipe5214',  '@anapaulaturatto', '@raiza.oficiall',  '@geni_.lopes', '@guildak4', '@raiza_querinoo',
'@blogueiros_al',  '@amadora_das_make', '@prirodrigueez',  '@taly_moreira', '@daylora4s', '@vini_wnr',  '@sr.frnds',  '@melissa_pereiiraa',  '@mell_pereiraa',
'@melissa.siilvaaa', '@sasajafet',  '@cleudian3', '@cleudi.ofc', '@eucleudi', '@cleudiane_slv', '@heycleu',  '@tthatacristina', '@tthatacris', '@cynthiatelesb',  '@ana_paulandrade',
'@adryenneyuri96',  '@fagunndes_viih',  '@fernandes_bellaah',  '@izaa_feiitosa',  '@ops_izaaah', '@izabelllyyh',  '@maycon.dias1',  '@Kesia_rodrigues1999',  '@giimiros',
'@ginascimentom',  '@kati_a421',  '@katiacatarina8', '@katiacatarinaandrade', '@__rafaellamartins',
'faah_santosz', 'lipe5214', 'Annalucia292020', 'Analucia29271', 'jessicapaixao_dentista', 'neia9212', 'marianaalecsia', '_rodriguestay',

]

context('Sorteios', () => {
  it('Sorteios conta taina', () => {
    cy.server()
    cy.route('POST', '**/web/comments/**').as('comentar')
    cy.route('POST', '**/accounts/get_encrypted_credentials/').as('logar');
    cy.visit('https://www.instagram.com/')
    cy.get('input[name="username"]').type('tainaisabela9@gmail.com', {delay: 250})
    cy.get('input[name="password"]').type('Estrela9', {delay: 250})
    cy.get('button > div').click()
    cy.wait(4000)
      for (let i = 0; i < 15; i++) {
        for(let i = 0; i < 5; i++) {
          cy.visit('https://www.instagram.com/p/CHqlG7ZAl45/') // agenda

          cy.get('textarea[placeholder="Add a comment…"]').click()
          cy.get('textarea[placeholder="Add a comment…"]').type('VOU GANHAR', {delay: 250})
          cy.get('button[type="submit"]').click()
          cy.wait('@comentar').then((resComentar) => {
            expect(resComentar.status).to.eq(200)
            })
          cy.wait(25000)
          }

        for(let i = 0; i < 9; i++) {
          let pessoaSorteada = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]
          let pessoaSorteada2 = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]
          cy.visit('https://www.instagram.com/p/CHqHxnxh37x/') //biquíni
          cy.get('textarea[placeholder="Add a comment…"]').click()
          cy.get('textarea[placeholder="Add a comment…"]').type(`${pessoaSorteada} ${pessoaSorteada2}`, {delay: 250})
          cy.get('button[type="submit"]').click()

          cy.wait('@comentar').then((resComentar) => {
            expect(resComentar.status).to.eq(200)
          })
          cy.wait(25000)
          }
        
        cy.wait(1800000)
      }
  })
})