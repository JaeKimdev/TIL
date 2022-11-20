//
//  ViewController.swift
//  segmentPractice
//
//  Created by smfc on 20/11/2022.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var firstView: UIView!
    @IBOutlet weak var secondView: UIView!
    
    @IBAction func switchView(_ sender: UISegmentedControl) {
        if sender.selectedSegmentIndex == 0 {
            firstView.alpha = 1
            secondView.alpha = 0
        } else {
            firstView.alpha = 0
            secondView.alpha = 1
        }
    }
    

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

