import json
import requests
api_token ='0a7dc6592aa8a162afa43126e0ea4da12a91825b'
url ='https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=0a7dc6592aa8a162afa43126e0ea4da12a91825b'
headers = {'Content-Type': 'multipart/form-data', 'Content-Type': 'multipart/form-data'}
resposta = {'answer':open('answer.json', 'rb')}
r = requests.post(url, files = resposta)
print(r.status_code, r.reason, r.text )
