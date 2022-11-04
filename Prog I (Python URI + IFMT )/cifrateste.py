import sys
alf = 'abcdefghijklmnopqrstuvwxyz'
rot = 2

def cifrar(message):
    m = ''
    for c in message:
        if c in alf:
            c_index = alf.index(c)
            m += alf[(c_index + rot) % len(alf)]
        else:
            m += c
    return m

def decifrar (message):
    m = ''
    for c in message:
        if c in alf:
            c_index = alf.index(c)
            m += alf[(c_index - rot) % len(alf)]
        else:
            m += c
    return m

def main():
    command = sys.argv[1].lower()
    message = sys.argv[2].lower()

    if command == 'cifrar':
        print cifrar(message)
    elif command == 'decifrar':
        print decifrar(message)
    else:
        print command + ' -> command not found'

if __name__ == '__main__':
    main()
