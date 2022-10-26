//
//  ViewController.swift
//  SelfSizingTableView
//
//  Created by smfc on 26/10/2022.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var tableView: UITableView!

    override func viewDidLoad() {
        super.viewDidLoad()
    }


}

extension ViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 50
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "cell",
                                                 for: indexPath)
        
        guard let customCell = cell as? CustomTableViewCell else {
            return cell
        }
        
        customCell.titleLabel?.text = indexPath.description
        customCell.postLabel?.text = """
                                        awdwafaw sefsfsefsegsse
                                        awfawgawa sefesfsefse
                                        sefsefesfgggsegseg
                                        sefseg
                                     """
        customCell.myImageView?.image = UIImage(named: "\(indexPath.row % 3)")
        
        return cell
    }
}
