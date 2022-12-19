import socket
from struct import *


def format_mac(mac):
    mac = map('{:02x}'.format, mac)
    return ':'.join(mac).upper()


def quadro_ethernet(dados):
    # mac_dist, mac_orig, tipo = unpack('! 6s 6s H', dados[0][0:14])
    mac_dist = dados[0][0:6]
    mac_orig = dados[0][6:12]
    proto = dados[0][12:14]
    payload = dados[0][14:]
    return mac_dist, mac_orig, proto, payload


raw_socket = socket.socket(socket.AF_PACKET, socket.SOCK_RAW, socket.ntohs(3))
while True:
    dados = raw_socket.recvfrom(65000)
    mac_dist, mac_orig, proto, payload = quadro_ethernet(dados)
    print('MAC Destino: ', format_mac(mac_dist))
    print('MAC Origem: ', format_mac(mac_orig))
    print('Protocolo: ', proto)  # socket.htons(proto))
