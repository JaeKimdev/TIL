//
//  SecondViewController.swift
//  SimpleTableViewPractice
//
//  Created by smfc on 17/10/2022.
//

import UIKit

class SecondViewController: UIViewController {
    
    var textToSet: String?
    
    @IBOutlet weak var textLabel: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        
        self.textLabel.text = self.textToSet
    }
    
}
