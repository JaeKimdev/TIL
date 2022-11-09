//
//  ViewController.swift
//  bb
//
//  Created by smfc on 9/11/2022.
//

import UIKit

class ViewController: UIViewController {
    
    var mainStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .vertical
        stackView.spacing = 8
        return stackView
    }()
    
    var buttonStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .horizontal
        stackView.distribution = .fillEqually
        return stackView
    }()
    
    var addButton: UIButton = {
        let button = UIButton()
        button.setTitle("고객 10명 추가", for: .normal)
        button.setTitleColor(.systemBlue, for: .normal)
        button.translatesAutoresizingMaskIntoConstraints = false
        return button
    }()
    
    var clearButton: UIButton = {
        let button = UIButton()
        button.setTitle("초기화", for: .normal)
        button.setTitleColor(.red, for: .normal)
        button.translatesAutoresizingMaskIntoConstraints = false
        return button
    }()
    
    var workingHoursStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .horizontal
        stackView.distribution = .fillEqually
        return stackView
    }()
    
    var titleLabel1: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "업무시간 - "
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.title2)
        label.textAlignment = .right
        return label
    }()
    
    var titleLabel2: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = " 04:33:253"
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.title2)
        label.textAlignment = .left
        return label
    }()
    
    var queueTitleStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .horizontal
        stackView.distribution = .fillEqually
        return stackView
    }()
    
    var waitingLabel: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "대기중"
        label.textColor = .white
        label.backgroundColor = .systemGreen
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.largeTitle)
        label.textAlignment = .center
        return label
    }()
    
    var processingLabel: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "업무중"
        label.textColor = .white
        label.backgroundColor = .systemIndigo
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.largeTitle)
        label.textAlignment = .center
        return label
    }()
    
    var queueStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .horizontal
        stackView.distribution = .fillEqually
        stackView.spacing = 8
        return stackView
    }()
    
    var waitingQueueScrollView: UIScrollView = {
        let scrollView = UIScrollView()
        return scrollView
    }()
    
    var waitingQueueStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .vertical
        stackView.spacing = 8
        return stackView
    }()
    
    var processingQueueScrollView: UIScrollView = {
        let scrollView = UIScrollView()
        return scrollView
    }()
    
    var processingQueueStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .vertical
        stackView.spacing = 8
        return stackView
    }()
    
    var depositCustomerLabel: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "5 - 예금"
        label.textColor = .black
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.body)
        label.textAlignment = .center
        return label
    }()
    
    var loanCustomerLabel: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "6 - 대출"
        label.textColor = .purple
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.body)
        label.textAlignment = .center
        return label
    }()
    
    var depositCustomerLabel1: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "5 - 예금"
        label.textColor = .black
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.body)
        label.textAlignment = .center
        return label
    }()
    
    var loanCustomerLabel1: UILabel = {
        let label = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        label.text = "6 - 대출"
        label.textColor = .purple
        label.font = UIFont.preferredFont(forTextStyle: UIFont.TextStyle.body)
        label.textAlignment = .center
        return label
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        addSubview()
        setUpUIConstraints()
    }
    
    private func addSubview() {
        self.view.addSubview(mainStackView)
        mainStackView.addArrangedSubview(buttonStackView)
        mainStackView.addArrangedSubview(workingHoursStackView)
        mainStackView.addArrangedSubview(queueTitleStackView)
        mainStackView.addArrangedSubview(queueStackView)
        
        buttonStackView.addArrangedSubview(addButton)
        buttonStackView.addArrangedSubview(clearButton)
        
        workingHoursStackView.addArrangedSubview(titleLabel1)
        workingHoursStackView.addArrangedSubview(titleLabel2)
        
        queueTitleStackView.addArrangedSubview(waitingLabel)
        queueTitleStackView.addArrangedSubview(processingLabel)
        
        queueStackView.addArrangedSubview(waitingQueueScrollView)
        queueStackView.addArrangedSubview(processingQueueScrollView)
        
        waitingQueueScrollView.addSubview(waitingQueueStackView)
        processingQueueScrollView.addSubview(processingQueueStackView)
        
        //--------
        
        waitingQueueStackView.addArrangedSubview(depositCustomerLabel)
        waitingQueueStackView.addArrangedSubview(loanCustomerLabel)
        
        processingQueueStackView.addArrangedSubview(depositCustomerLabel1)
        processingQueueStackView.addArrangedSubview(loanCustomerLabel1)
    }
    
    private func setUpUIConstraints() {
        mainStackView.leadingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.leadingAnchor).isActive = true
        mainStackView.trailingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.trailingAnchor).isActive = true
        mainStackView.topAnchor.constraint(equalTo: view.safeAreaLayoutGuide.topAnchor).isActive = true
        mainStackView.bottomAnchor.constraint(equalTo: view.safeAreaLayoutGuide.bottomAnchor).isActive = true
        
        waitingQueueStackView.leadingAnchor.constraint(equalTo: waitingQueueStackView.leadingAnchor).isActive = true
        waitingQueueStackView.trailingAnchor.constraint(equalTo: waitingQueueStackView.trailingAnchor).isActive = true
        waitingQueueStackView.topAnchor.constraint(equalTo: waitingQueueStackView.topAnchor).isActive = true
        waitingQueueStackView.bottomAnchor.constraint(equalTo: waitingQueueStackView.bottomAnchor).isActive = true
        
        waitingQueueStackView.widthAnchor.constraint(equalTo: waitingQueueScrollView.widthAnchor).isActive = true
        processingQueueStackView.widthAnchor.constraint(equalTo: processingQueueScrollView.widthAnchor).isActive = true

    }
}
