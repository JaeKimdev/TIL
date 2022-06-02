using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace AT3.Models
{
    public class teamMetadata
    {
        [DisplayFormat(DataFormatString = "{0:C}")]
        public string City;
    }

    public class gameMetadata
    {
        [DisplayFormat(DataFormatString = "{0:C}")]
        public string HostTeam;
    }

    public class ladderMetadata
    {
        [DisplayFormat(DataFormatString = "{0:C}")]
        public string TeamName;
    }
}