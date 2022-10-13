//
//  StackViewController.swift
//  practiceUIKit
//
//  Created by smfc on 10/10/2022.
//

import UIKit

class StackViewController: UIViewController {
    
    let vertical: UIStackView = UIStackView()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //button 만들기
        vertical.axis = .vertical
        vertical.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(vertical)
        
        let horizontal = UIStackView()
        horizontal.axis = .horizontal
        horizontal.translatesAutoresizingMaskIntoConstraints = false
        vertical.spacing = 10
        vertical.distribution = .fillEqually
        view.addSubview(horizontal)
        
        let addButton = UIButton()
        addButton.setTitle("add", for: .normal)
        addButton.setTitleColor(.blue, for: .normal)
        addButton.addTarget(self,
                            action: #selector(addView),
                            for: .touchUpInside)
        
        let removeButton = UIButton()
        removeButton.setTitle("remove", for: .normal)
        removeButton.setTitleColor(.blue, for: .normal)
        removeButton.addTarget(self,
                               action: #selector(removeView),
                               for: .touchUpInside)
        
        horizontal.addArrangedSubview(addButton)
        horizontal.addArrangedSubview(removeButton)
        horizontal.distribution = .fillEqually
        
        let safeArea = view.safeAreaLayoutGuide
        horizontal.bottomAnchor.constraint(equalTo: safeArea.bottomAnchor).isActive = true
        horizontal.leadingAnchor.constraint(equalTo: safeArea.leadingAnchor).isActive = true
        horizontal.trailingAnchor.constraint(equalTo: safeArea.trailingAnchor).isActive = true
        
        vertical.topAnchor.constraint(equalTo: safeArea .topAnchor).isActive = true
        vertical.bottomAnchor.constraint(equalTo: horizontal.topAnchor).isActive = true
        vertical.leadingAnchor.constraint(equalTo: horizontal.leadingAnchor).isActive = true
        vertical.trailingAnchor.constraint(equalTo: horizontal.trailingAnchor).isActive = true
    }
    
    @objc func addView() {
        let view = UIView()
        view.backgroundColor = .black
        view.isHidden =  true // view를 숨겨둔 상태로 먼저 추가한 다음
        vertical.addArrangedSubview(view)
        
        UIView.animate(withDuration: 0.3) {
            view.isHidden = false // 숨김을 해제해 준다
        }
    }
    
    @objc func removeView() {
        guard let last = vertical.arrangedSubviews.last else { return }
        
        UIView.animate(withDuration: 0.3) {
            last.isHidden = true
        } completion: { (_) in
            self.vertical.removeArrangedSubview(last)
        } // completion으로 다 사라지면 제거되게 처리
        
        vertical.removeArrangedSubview(last)
    }
}

