using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace AT3.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "NRL description page.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "NRL contact page.";

            return View();
        }
    }
}