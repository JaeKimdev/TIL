from flask import Flask, render_template
from werkzeug.wrappers import request

app = Flask("SuperScrapper")

@app.route("/")
def home():
    return render_template("home.html")


@app.route("/report")
def report():
    word = request.args.get("word")
    return render_template("report.html", searchingBy=word)

app.run(host="0.0.0.0")
