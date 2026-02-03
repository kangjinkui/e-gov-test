const todayLabel = new Date().toLocaleDateString('ko-KR', {
  year: 'numeric',
  month: 'long',
  day: 'numeric',
  weekday: 'short',
})

const stats = [
  {
    label: '검토 대기',
    value: '12건',
    delta: '+3',
    tone: 'alert',
  },
  {
    label: '개정 필요',
    value: '7건',
    delta: '-1',
    tone: 'warn',
  },
  {
    label: '완료',
    value: '28건',
    delta: '+4',
    tone: 'ok',
  },
  {
    label: '긴급 알림',
    value: '2건',
    delta: 'NEW',
    tone: 'danger',
  },
]

const tasks = [
  {
    title: '조례 3건 개정 여부 확인',
    meta: '오전 10:00 · 법령 변경 #482',
    tag: '우선',
  },
  {
    title: '법령-조례 매핑 재검토',
    meta: '오후 1:30 · 담당 부서 협업',
    tag: '협업',
  },
  {
    title: '검토 완료 내역 승인 요청',
    meta: '오후 4:00 · 팀장 승인',
    tag: '승인',
  },
]

const activity = [
  {
    time: '08:45',
    title: '행정안전부 법령 개정 공고 반영',
    detail: '지방자치법 시행령 개정 (2026-02-01)',
  },
  {
    time: '09:20',
    title: '개정 영향 조례 자동 탐지 완료',
    detail: '총 18건 영향 예상',
  },
  {
    time: '11:10',
    title: '부서 피드백 수신',
    detail: '재무과 2건, 복지과 1건',
  },
  {
    time: '14:05',
    title: '검토 요청 발송',
    detail: '상위법령 5건 관련 조례 통지',
  },
]

const focusMetrics = [
  {
    label: '법령-조례 매핑 정확도',
    value: 92,
  },
  {
    label: '검토 SLA 준수율',
    value: 84,
  },
  {
    label: '부서 응답률',
    value: 76,
  },
]

const assignments = [
  {
    ordinance: '서울특별시 공공시설 관리 조례',
    law: '공공시설 관리법',
    due: '02-06',
    status: '검토중',
  },
  {
    ordinance: '서울특별시 청년 지원 조례',
    law: '청년기본법',
    due: '02-08',
    status: '개정 필요',
  },
  {
    ordinance: '서울특별시 재난 대응 조례',
    law: '재난 및 안전관리 기본법',
    due: '02-10',
    status: '검토 대기',
  },
  {
    ordinance: '서울특별시 생활 폐기물 조례',
    law: '폐기물관리법',
    due: '02-13',
    status: '완료',
  },
]

const statusTone: Record<string, string> = {
  검토중: 'tone-info',
  '개정 필요': 'tone-warn',
  '검토 대기': 'tone-alert',
  완료: 'tone-ok',
}

export default function UserDashboard() {
  return (
    <div className="ud-shell">
      <header className="ud-topbar">
        <div className="ud-brand">
          <div className="ud-logo">LM</div>
          <div>
            <p className="ud-brand-title">Law Matcher</p>
            <p className="ud-brand-subtitle">사용자 대시보드</p>
          </div>
        </div>
        <div className="ud-controls">
          <label className="ud-search">
            <span className="ud-search-label">검색</span>
            <input
              type="search"
              placeholder="조례명, 법령, 부서 검색"
              aria-label="조례명, 법령, 부서 검색"
            />
          </label>
          <button className="ud-cta" type="button">
            새 검토 시작
          </button>
          <div className="ud-avatar" aria-label="사용자">KH</div>
        </div>
      </header>

      <section className="ud-hero">
        <div className="ud-hero-copy">
          <p className="ud-hero-date">{todayLabel}</p>
          <h1>
            김하늘 님, <span>오늘도 신속한 개정 검토를</span> 지원합니다.
          </h1>
          <p className="ud-hero-desc">
            실시간 개정 알림과 담당 조례 현황을 한 화면에서 확인하고,
            오늘 필요한 검토 작업을 바로 진행하세요.
          </p>
          <div className="ud-hero-badges">
            <span>신규 개정 5건</span>
            <span>협업 요청 3건</span>
            <span>긴급 통지 1건</span>
          </div>
        </div>
        <div className="ud-hero-panel">
          <div className="ud-hero-metric">
            <p className="ud-metric-label">오늘 완료 목표</p>
            <p className="ud-metric-value">6건</p>
            <p className="ud-metric-note">현재 2건 완료 · 4건 남음</p>
          </div>
          <div className="ud-hero-progress">
            <div className="ud-progress-track">
              <div className="ud-progress-fill" style={{ width: '34%' }} />
            </div>
            <div className="ud-progress-labels">
              <span>진행률</span>
              <strong>34%</strong>
            </div>
          </div>
          <div className="ud-hero-actions">
            <button type="button" className="ud-ghost">
              알림 설정
            </button>
            <button type="button" className="ud-outline">
              검토 큐 보기
            </button>
          </div>
        </div>
      </section>

      <section className="ud-stats">
        {stats.map((item) => (
          <article className={`ud-stat-card ud-${item.tone}`} key={item.label}>
            <p className="ud-stat-label">{item.label}</p>
            <div className="ud-stat-row">
              <strong>{item.value}</strong>
              <span>{item.delta}</span>
            </div>
            <p className="ud-stat-note">최근 7일 기준</p>
          </article>
        ))}
      </section>

      <section className="ud-grid">
        <article className="ud-card ud-card-tasks">
          <header>
            <h2>오늘의 업무</h2>
            <button type="button" className="ud-link">
              전체 일정
            </button>
          </header>
          <ul>
            {tasks.map((task) => (
              <li key={task.title}>
                <div>
                  <p className="ud-task-title">{task.title}</p>
                  <p className="ud-task-meta">{task.meta}</p>
                </div>
                <span className="ud-chip">{task.tag}</span>
              </li>
            ))}
          </ul>
        </article>

        <article className="ud-card ud-card-activity">
          <header>
            <h2>업데이트 타임라인</h2>
            <button type="button" className="ud-link">
              로그 보기
            </button>
          </header>
          <div className="ud-timeline">
            {activity.map((item) => (
              <div key={item.title} className="ud-timeline-item">
                <span>{item.time}</span>
                <div>
                  <p className="ud-timeline-title">{item.title}</p>
                  <p className="ud-timeline-detail">{item.detail}</p>
                </div>
              </div>
            ))}
          </div>
        </article>

        <article className="ud-card ud-card-focus">
          <header>
            <h2>핵심 지표</h2>
            <button type="button" className="ud-link">
              리포트
            </button>
          </header>
          <div className="ud-metrics">
            {focusMetrics.map((metric) => (
              <div key={metric.label} className="ud-metric-row">
                <div className="ud-metric-header">
                  <span>{metric.label}</span>
                  <strong>{metric.value}%</strong>
                </div>
                <div className="ud-progress-track">
                  <div
                    className="ud-progress-fill"
                    style={{ width: `${metric.value}%` }}
                  />
                </div>
              </div>
            ))}
          </div>
        </article>

        <article className="ud-card ud-card-table">
          <header>
            <h2>나의 담당 조례</h2>
            <button type="button" className="ud-link">
              전체 보기
            </button>
          </header>
          <div className="ud-table">
            <div className="ud-table-head">
              <span>조례명</span>
              <span>상위법령</span>
              <span>기한</span>
              <span>상태</span>
            </div>
            {assignments.map((item) => (
              <div className="ud-table-row" key={item.ordinance}>
                <div>
                  <p className="ud-table-title">{item.ordinance}</p>
                </div>
                <span className="ud-table-law">{item.law}</span>
                <span className="ud-table-due">{item.due}</span>
                <span className={`ud-badge ${statusTone[item.status]}`}>
                  {item.status}
                </span>
              </div>
            ))}
          </div>
        </article>
      </section>
    </div>
  )
}
