//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace AT3.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Games
    {
        public int ID { get; set; }
        public Nullable<int> HostTeam { get; set; }
        public Nullable<int> GuestTeam { get; set; }
        public Nullable<int> HostTeamScore { get; set; }
        public Nullable<int> GuestTeamScore { get; set; }
        public Nullable<System.DateTime> GameDate { get; set; }
    
        public virtual Teams Teams { get; set; }
        public virtual Teams Teams1 { get; set; }
    }
}
