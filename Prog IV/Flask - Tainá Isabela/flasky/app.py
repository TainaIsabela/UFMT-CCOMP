from flask import Flask, render_template
from flask_bootstrap import Bootstrap

app = Flask(__name__)
bootstrap = Bootstrap(app)

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/Coraline')
def coraline():
    return render_template('Coraline.html')

@app.route('/Frankweenie')
def frank():
    return render_template('Frank.html')

@app.route('/Noivacadaver')
def noiva():
    return render_template('Noiva.html')

@app.route('/Paranorman')
def paranorman():
    return render_template('ParaNorman.html')

@app.errorhandler(404)
def page_not_found(e):
    return render_template('404.html')

@app.errorhandler(500)
def internal_server_error(e):
    return render_template('500.html')