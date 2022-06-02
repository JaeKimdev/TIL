using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using AT3.Models;

namespace AT3.Controllers
{
    public class GamesController : Controller
    {
        private NFLDBEntities1 db = new NFLDBEntities1();

        // GET: Games
        public ActionResult Index()
        {
            var games = db.Games.Include(g => g.Teams).Include(g => g.Teams1);
            return View(games.ToList());
        }

        // GET: Games/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Games games = db.Games.Find(id);
            if (games == null)
            {
                return HttpNotFound();
            }
            return View(games);
        }

        // GET: Games/Create
        public ActionResult Create()
        {
            ViewBag.GuestTeam = new SelectList(db.Teams, "ID", "Name");
            ViewBag.HostTeam = new SelectList(db.Teams, "ID", "Name");
            return View();
        }

        // POST: Games/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "ID,HostTeam,GuestTeam,HostTeamScore,GuestTeamScore,GameDate")] Games games)
        {
            if (ModelState.IsValid)
            {
                db.Games.Add(games);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.GuestTeam = new SelectList(db.Teams, "ID", "Name", games.GuestTeam);
            ViewBag.HostTeam = new SelectList(db.Teams, "ID", "Name", games.HostTeam);
            return View(games);
        }

        // GET: Games/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Games games = db.Games.Find(id);
            if (games == null)
            {
                return HttpNotFound();
            }
            ViewBag.GuestTeam = new SelectList(db.Teams, "ID", "Name", games.GuestTeam);
            ViewBag.HostTeam = new SelectList(db.Teams, "ID", "Name", games.HostTeam);
            return View(games);
        }

        // POST: Games/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "ID,HostTeam,GuestTeam,HostTeamScore,GuestTeamScore,GameDate")] Games games)
        {
            if (ModelState.IsValid)
            {
                db.Entry(games).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.GuestTeam = new SelectList(db.Teams, "ID", "Name", games.GuestTeam);
            ViewBag.HostTeam = new SelectList(db.Teams, "ID", "Name", games.HostTeam);
            return View(games);
        }

        // GET: Games/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Games games = db.Games.Find(id);
            if (games == null)
            {
                return HttpNotFound();
            }
            return View(games);
        }

        // POST: Games/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            Games games = db.Games.Find(id);
            db.Games.Remove(games);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
