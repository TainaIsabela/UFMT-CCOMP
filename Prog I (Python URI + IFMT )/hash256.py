import hashlib

nonce = 0
key = 'f3q4uszyt67cfatq'
pad = hashlib.sha256(str(nonce) + key).digest()

# encrypt
plaintext = 'the quick brown fox jumped over.'
ciphertext = ''
for i in range(32):
    ciphertext += chr(ord(pad[i]) ^ ord(plaintext[i]))

# ciphertext = '\x1bf\x13\r\x0c\xc4\x18`\x129\x16\x12|\x96\xa7\xc2\xf5E_\x97\xc2\x010\x88]j\xce\xe3x\x14\xe8\xb6'

# decrypt
plaintext = 'MIIBHzANBgkqhkiG9w0BAQEFAAOCAQwAMIIBBwKBgQMwO3kPsUnaNAbUlaubn7ip
4pNEXjvUOxjvLwUhtybr6Ng4undLtSQPCPf7ygoUKh1KYeqXMpTmhKjRos3xioTy
23CZuOl3WIsLiRKSVYyqBc9d8rxjNMXuUIOiNO38ealcR4p44zfHI66INPuKmTG3
RQP/6p5hv1PYcWmErEeDewKBgGEXxgRIsTlFGrW2C2JXoSvakMCWD60eAH0W2PpD
qlqqOFD8JA5UFK0roQkOjhLWSVu8c6DLpWJQQlXHPqP702qIg/gx2o0bm4EzrCEJ
4gYo6Ax+U7q6TOWhQpiBHnC0ojE8kUoqMhfALpUaruTJ6zmj8IA1e1M6bMqVF8sr
lb/N'
for i in range(32):
    plaintext += chr(ord(pad[i] ^ ord(ciphertext[i]))

# plaintext = 'the quick brown fox jumped over.'