//
//  MainViewController.swift
//  221112
//
//  Created by smfc on 12/11/2022.
//

import UIKit
import Lottie

class MainViewController: UIViewController {
    
    let titleLabel: UILabel = {
        let label = UILabel()
        label.textColor = .black
        label.textAlignment = .center
        label.text = "main view"
        label.font = UIFont.boldSystemFont(ofSize: 70)
        return label
    }()
    
    let animationView: LottieAnimationView = {
        let animationView = LottieAnimationView(name: "125704-blue-loading")
        animationView.frame = CGRect(x: 0, y: 0, width: 400, height: 400)
        animationView.contentMode = .scaleAspectFill
        return animationView
    }()

    override func viewDidLoad() {
        super.viewDidLoad()
        
        view.backgroundColor = .black
        view.addSubview(animationView)
        animationView.center = view.center
        
        animationView.play{ (finish) in
            print("Animation finished")
            
            self.view.backgroundColor = .white
            self.animationView.removeFromSuperview()
            
            self.view.addSubview(self.titleLabel)
            self.titleLabel.translatesAutoresizingMaskIntoConstraints = false
            self.titleLabel.centerXAnchor.constraint(equalTo: self.view.centerXAnchor).isActive = true
            self.titleLabel.centerYAnchor.constraint(equalTo: self.view.centerYAnchor).isActive = true
        }
    }


}

