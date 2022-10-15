//
//  AnchorViewController.swift
//  practiceUIKit
//
//  Created by smfc on 9/10/2022.
//

import UIKit

class AnchorViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //버튼 생성
        let button = UIButton()
        button.setTitle("button", for: .normal)
        button.setTitleColor(.white, for: .normal)
        button.backgroundColor = .systemGreen
        view.addSubview(button)
        
        button.translatesAutoresizingMaskIntoConstraints = false
        //오토리사이징 마스크라는것을 오토레이아웃의 constraints로 자동으로 변경해줄 것인지
        //제대로 이해하고 사용할 것이 아니면 해제해 주는 것이 좋다.
        
        //MARK: -  버튼에 Anchor 사용하기
        let safeArea = view.safeAreaLayoutGuide //safeArea의 영역을 나타내주는 가이드
        
        //버튼 왼쪽이 safeArea 가이드라인 왼쪽과 20만큼 떨어져있다
        button.leadingAnchor.constraint(equalTo: safeArea.leadingAnchor,
                                        constant: 20).isActive = true
        // constraint라는 메서드가 return값으로 'NSLayoutConstraint' 클래스의 인스턴스를 만들어 주기 때문에
        // 경고가 떠서 뒤에 .isActive = true 를 넣어줘서 앵커를 만들어주자마자 활성화 시켜준다
        // let leadingAnchor = 으로 선언하고 아래에서 사용해도 된다.
        
        //버튼 오른쪽 safeArea 가이드라인 오른쪽에서 왼쪽으로 20만큼 떨어져 있다(안으로 들어와야 하기 때문에 음수)
        button.trailingAnchor.constraint(equalTo: safeArea.trailingAnchor,
                                         constant: -20).isActive = true
        
        //버텀 앵커 제약 1 = 버튼바닥이 safeArea 가이드라인 바닥과 같다.
        let safeBottomAnchor = button.bottomAnchor.constraint(equalTo: safeArea.bottomAnchor)
        safeBottomAnchor.isActive = true
        safeBottomAnchor.priority = .defaultHigh // = 750
        // priority를 원하는 숫자로 지정하려면 rawValue로 지정해주면 된다.
        // safeBottomAnchor.priority = .init(rawValue: 750)
        
        // 버텀 앵커 제약 2 = view의 바닥면에서 안쪽으로 20 보다 같더나 더 멀리 떨어져있다 (안쪽으로 와야 하기 때문에 -이고)
        // 20과 같거나 안쪽으로 더 많이 떨어져야 하기 때문에 greaterThan을 하면 0쪽으로 이동하고, lessThan을 써야함
        let viewBottomAnchor = button.bottomAnchor.constraint(lessThanOrEqualTo: view.bottomAnchor, constant: -20)
        viewBottomAnchor.isActive = true
    }
}
