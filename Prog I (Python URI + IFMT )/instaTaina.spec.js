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
'@ginascimentom',  '@kati_a421',  '@katiacatarina8', '@katiacatarinaandrade', '@__rafaellamartins'
]

context('Sorteios', () => {
  it('Sorteios conta taina, vinho unhas e make', () => {
    cy.server()
    cy.route('POST', '**/web/comments/**').as('comentar')
    cy.route('POST', '**/accounts/get_encrypted_credentials/').as('logar');

    for (let i = 0; i < 200; i++) {
    cy.visit('https://www.instagram.com/')
    cy.get('input[name="username"]').type('tainaisabela9@gmail.com', {delay: 250})
    cy.get('input[name="password"]').type('Estrela9', {delay: 250})
    cy.get('button > div').click()

    cy.wait(4000)

    cy.visit('https://www.instagram.com/p/CHqnO3uFQmP/') //Vinho

      let pessoaSorteada = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]
      let pessoaSorteada2 = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]

      cy.get('textarea[placeholder="Add a comment…"]').click()
      cy.get('textarea[placeholder="Add a comment…"]').type(`${pessoaSorteada} ${pessoaSorteada2}`, {delay: 250})
      cy.get('button[type="submit"]').click()
      cy.wait('@comentar').then((resComentar) => {
        expect(resComentar.status).to.eq(200)
      })

      cy.visit('https://www.instagram.com/p/CHJX9rxBK2x/') //Unhas
      cy.get('textarea[placeholder="Add a comment…"]').click()
      cy.get('textarea[placeholder="Add a comment…"]').type('@isabela_montanari @dory130', {delay: 250})
      cy.get('button[type="submit"]').click()
      cy.wait('@comentar').then((resComentar) => {
        expect(resComentar.status).to.eq(200)
      })

      cy.visit('https://www.instagram.com/p/CHfVI3Yg7gZ/') //Make 22/11
      cy.get('textarea[placeholder="Add a comment…"]').click()
      cy.get('textarea[placeholder="Add a comment…"]').type('@isabela_montanari', {delay: 250})
      cy.get('button[type="submit"]').click()
      cy.wait('@comentar').then((resComentar) => {
        expect(resComentar.status).to.eq(200)
       })

      cy.get('img[data-testid="user-avatar"]').last().click()
      cy.get('div').contains('Log Out').click()
      cy.wait(2000)

      .then('PERFIL 2', () => {
        cy.visit('https://www.instagram.com/')
        cy.get('input[name="username"]').type('akaneyoko9@gmail.com', {delay: 250})
        cy.get('input[name="password"]').type('estrela9', {delay: 250})
        cy.get('button > div').click()
        cy.wait(4000)

        cy.visit('https://www.instagram.com/p/CHSd5KWFnzC/') // roupas 25/11
        let pessoaSorteada = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]
        let pessoaSorteada2 = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]

        cy.get('textarea[placeholder="Add a comment…"]').click()
        cy.get('textarea[placeholder="Add a comment…"]').type('@isabela_montanari @dory130', {delay: 250})
        cy.get('button[type="submit"]').click()
        cy.wait('@comentar').then((resComentar) => {
          expect(resComentar.status).to.eq(200)
        })

        cy.visit('https://www.instagram.com/p/CHvPhhLqE4r/ ') // roupas 29/11
        let pessoaSorteada3 = pessoasTier1[Math.floor(Math.random()*pessoasTier1.length)]

        cy.get('textarea[placeholder="Add a comment…"]').click()
        cy.get('textarea[placeholder="Add a comment…"]').type(`${pessoaSorteada} ${pessoaSorteada2} ${pessoaSorteada3}`, {delay: 250})
        cy.get('button[type="submit"]').click()
        cy.wait('@comentar').then((resComentar) => {
          expect(resComentar.status).to.eq(200)
        })

        cy.visit('https://www.instagram.com/p/CHNZJTiDh27/') //Make 21/11
        cy.get('textarea[placeholder="Add a comment…"]').click()
        cy.get('textarea[placeholder="Add a comment…"]').type(`${pessoaSorteada} ${pessoaSorteada2}`, {delay: 250})
        cy.get('button[type="submit"]').click()

        cy.wait('@comentar').then((resComentar) => {
          expect(resComentar.status).to.eq(200)
        })
        cy.wait(6000)
        cy.get('img[data-testid="user-avatar"]').last().click()
        cy.get('div').contains('Log Out').click()
        cy.wait(500000)
      })
    }
  })
})