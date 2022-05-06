using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using invoiceDB.Models;

namespace invoiceDB.Controllers
{
    public class Order_ItemController : Controller
    {
        private invoiceDBEntities db = new invoiceDBEntities();

        // GET: Order_Item
        public ActionResult Index()
        {
            var order_Item = db.Order_Item.Include(o => o.Invoice).Include(o => o.Item);
            return View(order_Item.ToList());
        }

        // GET: Order_Item/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Order_Item order_Item = db.Order_Item.Find(id);
            if (order_Item == null)
            {
                return HttpNotFound();
            }
            return View(order_Item);
        }

        // GET: Order_Item/Create
        public ActionResult Create()
        {
            ViewBag.order_id = new SelectList(db.Invoices, "Invoice_no", "Invoice_no");
            ViewBag.OI_Item_id = new SelectList(db.Items, "Item_id", "Item_Description");
            return View();
        }

        // POST: Order_Item/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "order_id,OI_Item_id,Qty,ItemTotal")] Order_Item order_Item)
        {
            if (ModelState.IsValid)
            {
                db.Order_Item.Add(order_Item);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.order_id = new SelectList(db.Invoices, "Invoice_no", "Invoice_no", order_Item.order_id);
            ViewBag.OI_Item_id = new SelectList(db.Items, "Item_id", "Item_Description", order_Item.OI_Item_id);
            return View(order_Item);
        }

        // GET: Order_Item/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Order_Item order_Item = db.Order_Item.Find(id);
            if (order_Item == null)
            {
                return HttpNotFound();
            }
            ViewBag.order_id = new SelectList(db.Invoices, "Invoice_no", "Invoice_no", order_Item.order_id);
            ViewBag.OI_Item_id = new SelectList(db.Items, "Item_id", "Item_Description", order_Item.OI_Item_id);
            return View(order_Item);
        }

        // POST: Order_Item/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "order_id,OI_Item_id,Qty,ItemTotal")] Order_Item order_Item)
        {
            if (ModelState.IsValid)
            {
                db.Entry(order_Item).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.order_id = new SelectList(db.Invoices, "Invoice_no", "Invoice_no", order_Item.order_id);
            ViewBag.OI_Item_id = new SelectList(db.Items, "Item_id", "Item_Description", order_Item.OI_Item_id);
            return View(order_Item);
        }

        // GET: Order_Item/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Order_Item order_Item = db.Order_Item.Find(id);
            if (order_Item == null)
            {
                return HttpNotFound();
            }
            return View(order_Item);
        }

        // POST: Order_Item/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            Order_Item order_Item = db.Order_Item.Find(id);
            db.Order_Item.Remove(order_Item);
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
