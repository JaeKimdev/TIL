using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace invoiceDB.Models
{
    [MetadataType(typeof(ItemMetadata))]
    public partial class Item
    {
    }

    [MetadataType(typeof(InvoiceMetadata))]
    public partial class Invoice
    {
    }

    [MetadataType(typeof(Order_itemMetadata))]
    public partial class Order_Item
    {
    }

}