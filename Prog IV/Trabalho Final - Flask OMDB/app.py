from flask import Flask, escape, request, render_template, session, flash
from forsearch import searchreq
import json
import requests
from datetime import timedelta
app = Flask(__name__)
app.config["SESSION_PERMANENT"] = True

app.config["PERMANENT_SESSION_LIFETIME"] = timedelta(days=31)

app.secret_key = "d273fd202ae36a79dd36f160616859903861e535d49b44793b1d2930b05ff33a"


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/search', methods=['POST'])
def search():
    title = request.form['title']
    try:
        jsonresp = searchreq(title)
        results = jsonresp["Search"]
        return render_template("search_results.html", results=results)
    except Exception as e:
        return render_template("notfound.html"), 404


if __name__ == "__main__":
    app.run(debug=True)
