//
//  CustomTableViewCell.swift
//  SimpleTableViewPractice
//
//  Created by smfc on 17/10/2022.
//

import UIKit

class CustomTableViewCell: UITableViewCell {
    @IBOutlet var leftLabel: UILabel!
    @IBOutlet var rightLabel: UILabel!

    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }

}
