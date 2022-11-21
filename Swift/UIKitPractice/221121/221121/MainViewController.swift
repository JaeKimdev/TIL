//
//  MainViewController.swift
//  221121
//
//  Created by smfc on 21/11/2022.
//

import UIKit

class MainViewController: UIViewController {
    
    @IBOutlet weak var segmentControl: UISegmentedControl!
    @IBOutlet weak var tableView: UITableView!
    
    let data = [
        ["⚽️ Soccer", "⛳️ Golf", "🏀 Basketball", "🏈 American Football", "⚾️ Baseball", "🎾 Tennis", "🏐 Volleyball", "🏸 Badminton"],
        ["🍎 Apple", "🍐 Pear", "🍓 Strawberry", "🥑 Avocado", "🍌 Banana", "🍇 Grape", "🍈 Melon", "🍊 Orange", "🍑 Peach", "🥝 Kiwi"]
    ]
    var currentTableView: Int = 0
    
    @IBAction func segmentSwitch(_ sender: UISegmentedControl) {
        currentTableView = sender.selectedSegmentIndex
        tableView.reloadData()
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //tableView.backgroundColor = .darkGray
        currentTableView = 0
    }
}

extension MainViewController: UITableViewDelegate {
    
}

extension MainViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "tableViewCell", for: indexPath)
        cell.textLabel?.text = data[currentTableView][indexPath.row]
        //cell.textLabel?.backgroundColor = .blue
        //cell.textLabel?.textColor = .white
        return cell
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return data[currentTableView].count
    }
    
}
