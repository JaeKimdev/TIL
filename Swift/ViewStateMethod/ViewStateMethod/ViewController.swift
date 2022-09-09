//
//  ViewController.swift
//  ViewStateMethod
//
//  Created by smfc on 9/9/2022.
//

import UIKit

class ViewController: UIViewController {
    private let vcTitle: String = "FirstVC"
    
    override func loadView() {
        super.loadView()
        print("\(vcTitle) loadView")
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("\(vcTitle) viewDidLoad")
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        print("\(vcTitle) viewWillAppear")
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)
        print("\(vcTitle) viewDidAppear")
    }
    
    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(animated)
        print("\(vcTitle) viewWillDisappear")
    }
    
    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(animated)
        print("\(vcTitle) viewDidDisappear")
    }
    
    deinit {
        print("\(vcTitle) deinit")
    }
}

