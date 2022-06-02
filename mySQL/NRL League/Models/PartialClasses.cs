using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ComponentModel.DataAnnotations;

namespace AT3.Models
{
    [MetadataType(typeof(teamMetadata))]
    public partial class Teams
    { }

    [MetadataType(typeof(gameMetadata))]
    public partial class Games
    { }

    [MetadataType(typeof(ladderMetadata))]
    public partial class Ladder
    { }
}