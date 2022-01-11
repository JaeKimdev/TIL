from flask import Flask, render_template, request, redirect, send_file
from scrapper import get_jobs
from exporter import save_to_file

app = Flask("SuperScrapper")

db = {}


@app.route("/")
def home():
    return render_template("home.html")


@app.route("/report")
def report():
    word = request.args.get('word')
    if word:
        word = word.lower() #소문자로 만들어줌
        existingJobs = db.get(word)
        if existingJobs:
            jobs = existingJobs
        else:
            jobs = get_jobs(word)
            db[word] = jobs
    else:
        return redirect("/")
    return render_template(
        "report.html", SearchingBy=word, resultsNumber=len(jobs), jobs=jobs)


@app.route("/export")
def export():
# try를 시도하다 에러가 발생하면 expcet 가 실행
  try:
    word=request.args.get('word')
    if not word:
      raise Exception() #에러라고 생각
    word = word.lower()
    jobs = db.get(word)
    if not jobs:
      raise Exception()
    save_to_file(jobs)
    return send_file("jobs.csv")
    return f"Generate CSV for {word}"
  except:
    return redirect("/")




app.run(host="0.0.0.0")
