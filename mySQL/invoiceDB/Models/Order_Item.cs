//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace invoiceDB.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Order_Item
    {
        public int order_id { get; set; }
        public int OI_Item_id { get; set; }
        public Nullable<int> Qty { get; set; }
        public Nullable<double> ItemTotal { get; set; }
    
        public virtual Invoice Invoice { get; set; }
        public virtual Item Item { get; set; }
    }
}