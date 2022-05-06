using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace invoiceDB.Models
{
    public class ItemMetadata
    {
        [DisplayFormat(DataFormatString = "{0:C}")]
        public string Item_Price;
    }
    public class InvoiceMetadata
    {
        [DisplayFormat(DataFormatString = "{0:C}")]
        public string Order_Total_Price;
    }
    public class Order_itemMetadata
    {
        [DisplayFormat(DataFormatString = "{0:C}")]
        public string ItemTotal;
    }
}