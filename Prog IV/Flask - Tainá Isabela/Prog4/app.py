from flask import Flask, render_template
app = Flask(__name__)

@app.route('/')
def hello():
    return render_template('index.html')

@app.route('/Coraline')
def coraline():
    return render_template('Coraline.html')

@app.route('/Frankweenie')
def coraline():
    return render_template('Frank.html')

@app.route('/Noivacadaver')
def coraline():
    return render_template('Noiva.html')

@app.route('/Paranorman')
def coraline():
    return render_template('ParaNorman.html')

