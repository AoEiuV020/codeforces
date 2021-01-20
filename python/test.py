import glob
import os
import sys


class Matcher(object):
    def __init__(self, path):
        self.fileout = open(path, 'r')

    def write(self, message):
        line = self.fileout.readline(len(message))
        if line != message:
            raise AssertionError(f'expect\n"""{line}""", but\n"""{message}"""')
        else:
            sys.stderr.write(message)

    def flush(self):
        pass

    def close(self):
        self.fileout.close()


files = glob.glob("p*")
times = list(map(lambda x: os.stat(x).st_mtime, files))
problem = files[times.index(max(times))]
print(f'test {problem}')
sys.stdin = open(f'{problem}/in', 'r')
sys.stdout = Matcher(f'{problem}/out')
while True:
    try:
        exec(open(f'{problem}/main.py').read())
    except EOFError as e:
        break
