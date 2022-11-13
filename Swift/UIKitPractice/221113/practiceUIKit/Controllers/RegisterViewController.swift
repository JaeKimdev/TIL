//
//  RegisterViewController.swift
//  practiceUIKit
//
//  Created by smfc on 13/11/2022.
//

import UIKit

class RegisterViewController: UIViewController {
        
    override func viewDidLoad() {
        super.viewDidLoad()
        self.navigationController?.isNavigationBarHidden = true
    }
    
    @IBAction func moveToLogIn(_ sender: UIButton) {
        self.navigationController?.popViewController(animated: true)
    }
}
