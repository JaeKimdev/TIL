//
//  ConstraintViewController.swift
//  practiceUIKit
//
//  Created by smfc on 10/10/2022.
//

import UIKit

class ConstraintViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //버튼 생성
        let button = UIButton()
        button.setTitle("button", for: .normal)
        button.setTitleColor(.white, for: .normal)
        button.backgroundColor = .systemGreen
        view.addSubview(button)
        
        button.translatesAutoresizingMaskIntoConstraints = false
        
        let safeArea = view.safeAreaLayoutGuide //safeArea의 영역을 나타내주는 가이드
        
        //버튼 왼쪽이 safeArea 가이드라인 왼쪽과 20만큼 떨어져있다.
        let leading = NSLayoutConstraint(item: button,
                                         attribute: .leading,
                                         relatedBy: .equal,
                                         toItem: safeArea,
                                         attribute: .leading,
                                         multiplier: 1,
                                         constant: 20)
        leading.isActive = true  //이렇게 활성화해줘도 되고 맨 아래에서 한꺼번에 활성화할 수도 있다.
        
        //버튼 오른쪽 safeArea 가이드라인 오른쪽과 20만큼 떨어져있다(안으로 들어와야 하기 때문에 음수)
        let trailing = NSLayoutConstraint(item: button,
                                          attribute: .trailing,
                                          relatedBy: .equal,
                                          toItem: safeArea,
                                          attribute: .trailing,
                                          multiplier: 1,
                                          constant: -20)
        
        //버텀 앵커 제약 1 = 버튼바닥이 safeArea 가이드라인 바닥과 같다.
        let bottomSafeArea = NSLayoutConstraint(item: button,
                                                attribute: .bottom,
                                                relatedBy: .equal,
                                                toItem: safeArea,
                                                attribute: .bottom,
                                                multiplier: 1,
                                                constant: 0)
        bottomSafeArea.priority = .defaultHigh // Priority 750으로 낮춰주기
        
        // 버텀 앵커 제약 2 = view의 바닥면에서 안쪽으로 20 보다 같더나 더 멀리 떨어져있다 (안쪽으로 와야 하기 때문에 -이고)
        // 20과 같거나 안쪽으로 더 많이 떨어져야 하기 때문에 greaterThan을 하면 0쪽으로 이동하고, lessThan을 써야함
        let bottomView = NSLayoutConstraint(item: button,
                                            attribute: .bottom,
                                            relatedBy: .lessThanOrEqual,
                                            toItem: view,
                                            attribute: .bottom,
                                            multiplier: 1,
                                            constant: -20)
        
        NSLayoutConstraint.activate([trailing, bottomSafeArea, bottomView])
    }
}
