//
//  DynamicViewController.swift
//  practiceUIKit
//
//  Created by smfc on 13/10/2022.
//

import UIKit

class DynamicViewController: UIViewController {
    
    @IBOutlet var stackView: UIStackView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
    } 
    
    @IBAction func addLabel() {
        let label = UILabel()
        label.font = UIFont.preferredFont(forTextStyle: .largeTitle)
        label.isHidden =  true
        label.text = """
            awdwafawf
            awfawggawfa
            awdawdadaw
            awawdffgf
            awfwwadawf
            awdawdawdwad
            """
        label.numberOfLines = 0
        stackView.addArrangedSubview(label)
        
        UIView.animate(withDuration: 0.3) {
            label.isHidden = false
        }
    }
    
    @IBAction func removeLabel() {
        guard let last = stackView.arrangedSubviews.last else { return }
        
        UIView.animate(withDuration: 0.3) {
            last.isHidden = true
        } completion: { (_) in
            self.stackView.removeArrangedSubview(last)
        }
    }
}
