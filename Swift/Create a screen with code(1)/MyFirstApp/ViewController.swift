//
//  ViewController.swift
//  MyFirstApp
//
//  Created by smfc on 2/11/2022.
//

import UIKit

class ViewController: UIViewController {
    
    var titleLabel: UILabel = {
        let label = UILabel()
        label.text = "Hello World!"
        label.textAlignment = .center
        label.font = UIFont.boldSystemFont(ofSize: 50)
        label.textColor = .white
        
        return label
    }()

    override func viewDidLoad() {
        super.viewDidLoad()
        
        view.backgroundColor = .blue
        view.addSubview(titleLabel)
        
        titleLabel.translatesAutoresizingMaskIntoConstraints = false
        titleLabel.centerXAnchor.constraint(equalTo: view.centerXAnchor).isActive = true
        titleLabel.centerYAnchor.constraint(equalTo: view.centerYAnchor).isActive = true
    }


}

