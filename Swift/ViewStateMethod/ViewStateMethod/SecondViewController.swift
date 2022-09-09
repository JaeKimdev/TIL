//
//  SecondViewController.swift
//  ViewStateMethod
//
//  Created by smfc on 9/9/2022.
//

import UIKit

import UIKit

class SecondViewController: UIViewController {
    private let vcTitle: String = "SecondVC"
    
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
    
    @IBAction func dismissView(_ sender: Any) {
        self.dismiss(animated: true)
    }
    
    @IBAction func pop(_ sender: Any) {
        guard let firstVC = navigationController?.viewControllers
            .first(where: { $0 is ViewController}) else {
            return
        }
        
        navigationController?
            .popToViewController(firstVC, animated: true)
    }
    
    deinit {
        print("\(self.title) 해제됨")
    }
}
